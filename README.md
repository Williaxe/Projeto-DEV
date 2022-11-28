# Projeto-DEV
Projeto de conclusão do curso UPGRADE DEV BRadesco

Tema: 
Conciliação do equipamento físico com o contábil no estoque e rede de agências.

Cenário atual:
A AOC ampliou sua área de atuação gerenciando equipamentos de Dotação (Computador, Monitor, Impressora, Contador de Cédula, etc) Segurança e Energia (Câmera de segurança, CFTV, Bomba de Fumaça, etc) e Comunicação (Totem, Televisão, etc) nas redes de agência e estoque.  O Banco utiliza um sistema de inventário contábil o SAP, nele cadastramos os equipamentos que se enquadram nas seguintes regras contábeis:

•	Valor de aquisição acima de R$ 1200,00.
•	Possibilidade de mensurar a quantidade.
•	Durabilidade do equipamento.

Para encaminhar os equipamentos para outro local, elaboramos um documento, o DCM. Isso faz com que o registro contábil mude de uma junção (código de endereço da agência ou estoque) cadastrada para outra. Após 30 dias esse documento é recebido na junção destino e o registro contábil fica pertencendo a junção.
O procedimento de movimentação funciona assim:

•	Identifica o equipamento que vai ser movimentado.
•	Elabora o DCM com as informações de Equipamento, Junção Remetente e Junção Destino.
•	Solicita o transporte do equipamento com a inserção do DCM no sistema.
•	Equipamento recolhido.
•	Chega à junção destino.

Isso acarreta muitos problemas no controle, por que no decorrer do processo muitas vezes o equipamento não é recolhido, por diversos motivos, só que o registro acaba após 30 dias indo para junção destino que consta no DCM elaborada
Dessa forma ocorrem muitas divergências entre as informações do sistema SAP, que é utilizado para gerenciar os registros contábeis desses equipamentos e um controle onde esses equipamentos estão fisicamente. 
Além disso os equipamentos que não entram nas regras contábeis, atualmente não temos um sistema ou banco de dados que cadastre esses equipamentos físicos instalados na rede e nos estoques.

Objetivo:
Criar API onde pode ser cadastrado toda as agências da rede, os estoques pertencentes a AOC e cada agência e gestor de estoque vai poder cadastrar, consultar, alterar e excluir os equipamentos que constam fisicamente nas suas dependências. 
Com isso vai ser possível controlar quando efetivamente os equipamentos saíram da agência ou estoque e quando chegaram ao seu destino, independente do prazo que consta no SAP.
Todos os equipamentos vão poder ser cadastrados e controlados independente das regras contábeis. Com esse cadastro é possível fazer um controle mais efetivo dos equipamentos e com possibilidade de executar um comparativo com a base do SAP e com o resultado demonstrar para as agências o que consta com divergência do físico e contábil.
