# language: pt
@conexaoTeste
	Funcionalidade: Videoconferencia medico-paciente

  Esquema do Cenario: Regra de negocio: Se a conexao de video falhar, iniciar comunicacao por audio.
    Dado Medico "<medico>" e Paciente "<paciente>"
    Quando conexao com qualidade <qualidade_conexao> estabelecida por Enfermeiro "<enfermeiro>"
    Entao tipo de transmissao "<tipo>" deve responder a qualidade de conexao

    Exemplos: 
      | medico | paciente | enfermeiro | qualidade_conexao | tipo       |
      | jose   | maria    | teste      |                 5 | VideoAlta  |
      | joao   | mario    | teste      |                 3 | VideoBaixa |
      | marta  | flavio   | teste      |                 1 | Audio      |
