package com.example.trigo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ReceitaRepository repository){
        return args -> {

            //Adicionando um item ao BD para teste
            log.info("Preloading " + repository.save(new Receita("Tapioca de frango", "Massa de tapioca e frango", "faz a tapioca na frigideira e põe o frango. já era", "Sem lactose")));

            //Outro item com filtro diferente
            log.info("Preloading " + repository.save(new Receita("Tapioca de frango vegano com leite", "Massa de tapioca, frango vegano e leite", "faz a tapioca na frigideira e põe o frango, pega um copo e põe leite. já era", "Vegano")));
        };
    }
}
