"# DeBairro_TCC" 
Conveções de código e nomenclaturas

Classes das telas: nome que identifique a tela e activity no final, todas as letras iniciais devem ser maiúsculas, sem caracteres especiais.
Exemplo: LoginActivity.java, CadastroActivity.java

Classes de objetos: nome que identifique a classe, todas as letras iniciais devem ser maiúsculas, sem caracteres especiais.
Exemplo: Cliente.java, Usuario.java

Atributos e funções de classes: camel case(primeira letra da primeira palavra minúscula, se houver necessidade de outras palavras as letras iniciais devem ser maiúsculas), se os atributos referenciarem Views, eles devem ter como inicial a sigla desta.
Exemplo: nomeCliente, tvNomeCliente(o tv é de TextView), etSenhaLogin

Arquivos Layout(XML): nome que identifique a tela (se for necessário mais de um, deve ser separado por _), _layout no final,todas as letras minúsculas.
Exemplo: splash_screen_layout.xml, login_layout.xml, cadastro_layout.xml 

ID's XML: sigla que das iniciais que identifiquem a view utilizada em letra minúscula (caso for um TextView, usar tv, caso for um EditText, colocar et, por exemplo), nome que identifique de maneira clara o que esse id está referenciando, letra minúscula, caso for necessário mais de uma palavra, as próximas iniciais devem ser maiúsculas, só é necessário indicar uma id naquilo que irá ser programado futuramente, como um campo de texto ou um botão, por exemplo.
Exemplo: tv_nomeCliente, et_nomeCliente, iv_fotoLogo.

Commits no Git: devem ser feitos após cada modificação relevante como a criação do design de uma tela, a programação de uma funcionalidade, ou até o momento que você não vai poder mexer no projeto naquele momento.

Branchs: nome que indique o que foi feito, uma branch para cada alteração relevante que necessite de outra branch, letras minúsculas e separação de  palavras com _


