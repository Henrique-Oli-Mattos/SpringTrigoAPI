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
            log.info("Preloading " + repository.save(new Receita("Pudim de paçoca", "Delicioso pudim de paçoca vegano", "1 e 1/2 xicara de Amendoim Torrado sem casca. 1 litro de Água. 16 Paçocas Rolhas. 2 colheres (sopa) bem generosas de Amido de Milho", 
            
            "Primeiro passo é preparar um leite de amendoim. Para isso, coloque o amendoim torrado e sem casca de molho na água por 8 horas Tire-o da água e bata-o no liquidificador com 1 litro de água, até obter um tipo de leite. Agora é só coar com uma peneirinha ou voal e o leite de amendoim está prontinho. Agora vamos ao pudim. Bata todos os ingredientes no liquidificador e depois leve essa mistura para o fogo médio, em uma panela, mexendo sempre até engrossar. O ponto vai ser tipo de um brigadeiro.Unte uma forma, despeja a massa e leve para a geladeira por umas 6 horas. Desinforme e enfeite com um pouco de paçoca por cima.",
            
            "Vegano", "a" )));

            //Outro item com filtro diferente
            log.info("Preloading " + repository.save(new Receita("Pão", "Pão fofo sem glúten", "4 ovos. 1 xícara de leite em pó.  3 colheres de sopa de amido de milho. 1 pitada de sal. 1 colher de sopa de fermento químico (de bolo).",

            "Misture em uma tigela o leite em pó, o amido de milho e o sal. Bata as claras em neve. Acrescente as gemas e bata até misturar. Incorpore um terço da mistura de ovos aos sólidos. Adicione o resto da mistura de ovos e misture com cuidado. Acrescente o fermento por último à massa e transfira para uma fôrma untada e polvilhada com leite em pó (usei fôrma de bolo inglês de silicone, que nem precisa) Leve para assar em forno preaquecido a 180 graus até passar no teste do palito (aqui em casa foram uns 40 minutos).",

            "Sem Glúten", "a")));

            //Outro item
            log.info("Preloafing " + repository.save(new Receita("Macarrão Pupunha", "Macarrão de Pupunha com Bechamel de Castanha do Pará sem lactose", "250g Macarrão de Pupunha. 1 copo de Leite de Castanha do Pará. 2 colheres de sopa de Araruta em pó (pode ser substiuída por fécula de batata ou amido de milho). Azeite de Oliva para refogar. Meia Cebola pequena. Noz Moscada a gosto. Pimenta do Reino a gosto. Sal a gosto. Manjericão a gosto.",
            
            "Coloque o macarrão para ferver em água por uns 8 minutos (experimente para verificar o ponto que prefere. Pique a cebola e refogue no azeite. Separe meia xícara de leite e dissolva a araruta em pó, para não embolotar. Coloque o leite, a araruta dissolvida e mexa em fogo baixo até começar a engrossar. Adicione o sal, a noz moscada e a pimenta e dê o ponto no molho. Coloque o manjericão para decorar. Escorra o macarrão e sirva! Voilá!",
            
            "Sem Lactose", "a")));
        };
    }
}
