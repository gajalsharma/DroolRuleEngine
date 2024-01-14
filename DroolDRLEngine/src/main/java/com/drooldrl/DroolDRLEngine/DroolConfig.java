package com.drooldrl.DroolDRLEngine;

import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class DroolConfig {

    private static final String RULES_CUSTOMER_RULES_DRL = "/Users/office/Downloads/DroolDRLEngine/src/main/resources/rules.drl";
    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }







//    private KieServices kieServices= KieServices.Factory.get();
//
//    public KieFileSystem getKieFileSystem() throws IOException{
//        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource("Users/office/Downloads/DroolDRLEngine/src/main/resources/rules.drl"));
//        return kieFileSystem;
//
//    }
//
//    @Bean
//    public KieContainer getKieContainer() throws IOException{
//        System.out.println("Container created");
//        getKieRepository();
//        KieBuilder kb =kieServices.newKieBuilder(getKieFileSystem());
//        kb.buildAll();
//        KieModule kieModule = kb.getKieModule();
//        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//        return kieContainer;
//
//    }
//
//
//
//    public void getKieRepository(){
//        final KieRepository kieRepository=kieServices.getRepository();
//        kieRepository.addKieModule(new KieModule() {
//            @Override
//            public ReleaseId getReleaseId() {
//                return kieRepository.getDefaultReleaseId();
//            }
//        });
//    }
//
//    @Bean
//    public KieSession getKieSession() throws IOException{
//        System.out.println("Session Created");
//        return getKieContainer().newKieSession();
//    }

}
