package com.astrazeneca;

import org.junit.Test;

public class SearchFreelancer extends FreelancerUpWork{

    @Test
    public void freelancerMasBarato()

    {
        navegarSitio("https://upwork.com");
        verificarLandingPage();
        buscaFreelancer();
        listarFreelancer();

    }

}