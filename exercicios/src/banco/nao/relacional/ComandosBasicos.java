package banco.nao.relacional;

public class ComandosBasicos {

	/*
	 * show dbs
	 * db.createCollection('estados')
	 * show collections
	 * db.estados.drop()
	 * 
	 * 
	 * db.estados.insert({nome : "Acre, sigla : "AC", regiao : "Norte"})
	 * 
	 * db.estados.save({nome : "Alagoas", sigla : "AL", regiao : "Nordeste", populacao : 320000
	 * 
	 * db.estados.inserir({
	 * 		nome : "Rio de Janeiro",
	 * 		sigla : "RJ",
	 * 		regiao : "Sudeste",
	 * 		cidades : [{
	 * 				nome : "Niteroi",
	 * 				area : 133.9,
	 * 				populacao : 390888
	 * 			}]
	 * })
	 * 
	 * 
	 * db.estados.find({$or: [{sigla : "RJ"}, {sigla : "AC"}]).pretty()
	 * db.estados.find({$and: [{sigla : "RJ"}, {sigla : "AC"}]).pretty()
	 * 
	 * db.estados.find({populacao :{$exists: true}})
	 * 
	 * db.estados.count()
	 * 
	 * db.estados.find({sigla : "SP"}. {nome: 1, sigla 1, _id : 0})
	 */
}
