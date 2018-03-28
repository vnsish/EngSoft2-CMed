@cadastroMedicoTeste
Feature: Cadastro de usuario
  Metodo usado pra criar usuarios

  Scenario Outline: Title of your scenario outline
    Given Medico com "<Nome>" com CPF "<CPF>" e CRM "<CRM>"
    Then o medico criado deve ser criado

    Examples: 
      | Nome 		| CPF 	   | CRM	|
      | Arnaldo     | 12345    | 456 	|
      | Arnadldo     | 12345    | 456 	|
      | Arnasldo     | 12345    | 456 	|
      | Arnaaldo     | 12345    | 456 	|
      | Arndaldo 2    | 12345 3   | 456 	|
      | Arnaldo f    | 12345    | 456 	|
