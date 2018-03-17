### Como rodar o projeto
* Criar um banco de dados ```research```
* Criar um scheme ```tasks```
Caso contrário, basta atualizar os dados do seu PostgreSQL no ```application.properties```.
#### Backend
Ao executar o projeto ele estará escutando em ```http://localhost:8080/graphql```

#### Frontend
Está dentro do projeto no diretório ```src/main/frontend```
* Executar ```$ npm install``` para baixar e instalar as dependências
Para rodar basta executar ```$ npm run dev```, caso tenha o quasar-cli instalado execute ```$ quasar dev```
