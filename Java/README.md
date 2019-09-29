Ce qui est domandé:

	-c'est ajouter une nouvelle catigorie d'item.
	-une item est definie par (Name , Sellin value , Quality value).
	-à la fin de chaque jour notre programme doit dégrader la valeur et reduire le nombre du 	jous.

Les Test unitaires:

	-Si la reduction "Sellin value" par un unité => La reduction de la "Quality value" par unité*2.
	-Si la "Quality value" est toujours positive.
	-Si la "Quality value" d'item "Aged Brie" ne se degrade pas
	-Si la "Quality value" d'item "Aged Brie" ne depasse pas 50.
	-Si la "Quality value" d'item "Sulfuras" ne se degrade pas et n'entre pas en sold.
	-Si le nom d'item egale "Backstage passes" 
		-la "Quality value" s'augmante par 2 si "Sellin value" <= à 10.
		-la "Quality value" s'augmante par 3 si "Sellin value" <= à 5.
		-la "Quality value" egale à 0 si "Sellin value" egale 0.
	-- new feature test
			-Si la reduction "Sellin value" par un unité => La reduction de la "Quality value" par unité*4.
Code Smiles:
