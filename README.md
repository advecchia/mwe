O trabalho consiste na: 
- Construção automática de recursos para a simplificação de MWEs e de palavras 
simples, no inglês e em português. 

Isto inclui:
        dicionários de paráfrases (de MWEs e palavras simples), 
        dicionários de definições, 
        tesauros distribucionais (para MWEs e palavras simples), 
        dicionários de frequências (de MWEs e palavras simples).

Técnicas de identificação automática de paráfrases: 
Para MWEs existe o trabalho do Preslav Nakov (Nakov e Kim), 
estendendo ele com identificação de composicionalidade, 
que determinaria como gerar a paráfrase. 

Por exemplo, "coffee machine” pode ser parafraseado a partir de um conjunto 
standard de padrões como:

<PADRAO> = is made of
           is part of
           is caused by
           makes
           does
           causes

machine that <PADRAO> coffee

enquanto que “scape goat” (bode expiatório) não. Este tem que ser tratado como 
uma palavra só e parafraseado usando técnicas para palavras simples.