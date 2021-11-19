package Totem;

import java.util.*;

public class Totem {
	public static void main(String[] args) {
		int x = 0, y, quantidade_bebida, volume_escolhido = 0, quantidade_de_itens = 0;
		double z, quantidade_lanche, preco = 0, valor_energetico = 0;
		String escolhido_lanche = "", escolhido_bebida = "", Carne = "";
		Scanner sc = new Scanner(System.in);

		// Setando valores dos objetos
		lanches Bigmac = new lanches();
		lanches Mcchicken = new lanches();
		lanches Mcfish = new lanches();

		Bebidas cocacola = new Bebidas();
		Bebidas suco = new Bebidas();
		Bebidas milk_shake = new Bebidas();

		Bigmac.setCarne("vermelha");
		Bigmac.setPeso(204);
		Bigmac.setPreco(23);
		Bigmac.setValor_energetico(500);

		Mcchicken.setCarne("Frango");
		Mcchicken.setPeso(176);
		Mcchicken.setPreco(20);
		Mcchicken.setValor_energetico(450);

		Mcfish.setCarne("Peixe");
		Mcfish.setPeso(150);
		Mcfish.setPreco(18);
		Mcfish.setValor_energetico(370);

		cocacola.setPreco(6);
		cocacola.setTipo("Refrigerante");
		cocacola.setSabor("Coca-cola");
		cocacola.setValor_energetico(300);

		suco.setPreco(4);
		suco.setTipo("Suco");
		suco.setSabor("Uva");
		suco.setValor_energetico(189);

		milk_shake.setPreco(12);
		milk_shake.setTipo("Milk Shake");
		milk_shake.setSabor("Baunilha");
		milk_shake.setValor_energetico(468);

		//escolha do lanche e da quantidade pelo usuário
		System.out.println("Vamos de que hoje?\n1 - Bigmac\n2 - McChicken\n3 - Mcfish ");
		//exception para capturar variável de outro tipo
		try {
		x = sc.nextInt();
		if (x != 1 && x != 2 && x != 3) {
			encerrar("OTARIO"); //chamando método encerrar string
		}
		} catch (Exception e) {
			System.out.println("Formato inválido!");
			System.exit(0);
		}
		//fim do exception
		
		System.out.println("Quantos desse, campeão?");
		z = sc.nextDouble();
		quantidade_lanche = z;
		quantidade_de_itens += z;

		if (x == 1) {
			preco = Bigmac.getPreco() * z;
			escolhido_lanche = "Bigmac";
			valor_energetico = Bigmac.getValor_energetico() * z;
		} else if (x == 2) {
			preco = Mcchicken.getPreco() * z;
			escolhido_lanche = "Mcchicken";
			valor_energetico = Mcchicken.getValor_energetico() * z;
		} else if (x == 3) {
			preco = Mcfish.getPreco() * z;
			escolhido_lanche = "Mcfish";
			valor_energetico = Mcfish.getValor_energetico() * z;
		}

		System.out.println("Deseja incluir molho?\n1 - sim\n2 - não");
		x = sc.nextInt();

		if (x == 1) {
			if (escolhido_lanche.equals("Bigmac")) {
				Bigmac.setMolho(true);
			} else if (escolhido_lanche.equals("Mcchicken")) {
				Mcchicken.setMolho(true);
			} else if (escolhido_lanche.equals("Mcfish")) {
				Mcfish.setMolho(true);
			}
		} else if (x == 2) {
			if (escolhido_lanche.equals("Bigmac")) {
				Bigmac.setMolho(false);
			} else if (escolhido_lanche.equals("Mcchicken")) {
				Mcchicken.setMolho(false);
			} else if (escolhido_lanche.equals("Mcfish")) {
				Mcfish.setMolho(false);
			}
		} else {
			encerrar("OTARIO");
		}

		System.out.println("Deseja incluir batata frita por um acréscimo de 3 reais?\n1 - sim\n2 - não");
		x = sc.nextInt();

		if (x == 1) {
			if (escolhido_lanche.equals("Bigmac")) {
				Bigmac.setAcompanhamento(true);
				quantidade_de_itens += z;
			} else if (escolhido_lanche.equals("Mcchicken")) {
				Mcchicken.setAcompanhamento(true);
				quantidade_de_itens += z;
			} else if (escolhido_lanche.equals("Mcfish")) {
				Mcfish.setAcompanhamento(true);
				quantidade_de_itens += z;
			}
			preco += (3 * quantidade_lanche);
			valor_energetico += (312 * quantidade_lanche);
		}
		if (x != 1 && x != 2) {
			encerrar("OTARIO");
		}

		System.out.println("Deseja incluir salada?\n1 - sim\n2 - não");
		x = sc.nextInt();

		if (x == 1) {
			if (escolhido_lanche.equals("Bigmac")) {
				Bigmac.setSalada(true);
			} else if (escolhido_lanche.equals("Mcchicken")) {
				Mcchicken.setSalada(true);
			} else if (escolhido_lanche.equals("Mcfish")) {
				Mcfish.setSalada(true);
			}
		} else if (x == 2) {
			if (escolhido_lanche.equals("Bigmac")) {
				Bigmac.setSalada(false);
				;
			} else if (escolhido_lanche.equals("Mcchicken")) {
				Mcchicken.setSalada(false);
			} else if (escolhido_lanche.equals("Mcfish")) {
				Mcfish.setSalada(false);
			}
		}

		//Pegando a carne de acordo com o lanche escolhido
		if (escolhido_lanche.equals("Bigmac")) {
			Carne = Bigmac.getCarne();
		} else if (escolhido_lanche.equals("Mcchicken")) {
			Carne = Mcchicken.getCarne();
		} else if (escolhido_lanche.equals("Mcfish")) {
			Carne = Mcfish.getCarne();
		}

		System.out.println("Deseja prosseguir e escolher sua bebida?\n1 - sim\n2 - não");
		x = sc.nextInt();

		if (x == 2) {
			// criação de lista para utilizar o Collections
			List<Integer> total_itens = Arrays.asList(quantidade_de_itens);
			Collections.sort(total_itens);
			
			System.out.println("---------------------------------");
			System.out.println("Aqui estão as informações do seu pedido:\n");
			System.out.println("|Lanche:                   " + escolhido_lanche);
			System.out.println("|Quantidade:                 " + quantidade_lanche);
			System.out.println("|Tipo de carne:            " + Carne);
			if (Bigmac.isSalada() == true || Mcchicken.isSalada() == true || Mcfish.isSalada() == true) {
				System.out.println("|Salada:          	      Sim");
			} else {
				System.out.println("|Salada:          	      Não");
			}

			if (Bigmac.isAcompanhamento() == true || Mcchicken.isAcompanhamento() == true
					|| Mcfish.isAcompanhamento() == true) {
				System.out.println("|Acompanhamento:              Sim");
			} else {
				System.out.println("|Acompanhamento:              Não");
			}

			if (Bigmac.isMolho() == true || Mcchicken.isMolho() == true || Mcfish.isMolho() == true) {
				System.out.println("|Molho:                       Sim");
			} else {
				System.out.println("|Molho:                       Não");
			}

			if (escolhido_lanche.equals("Bigmac")) {
				System.out.print("|Peso total dos lanches:    " + Bigmac.getPeso() * quantidade_lanche + " g\n");
			} else if (escolhido_lanche.equals("Mcchicken")) {
				System.out.print("|Peso total dos lanches:    " + Mcchicken.getPeso() * quantidade_lanche + " g\n");
			} else if (escolhido_lanche.equals("Mcfish")) {
				System.out.print("|Peso total dos lanches:    " + Mcfish.getPeso() * quantidade_lanche + " g\n");
			}

			System.out.println("|Total de itens:             " + total_itens);
			System.out.println("|Valor energético:       " + valor_energetico + " Kcal");
			System.out.println("|********************************");
			System.out.print("|Preço total              R$" + preco + "\n");
			encerrar(1);
		}
		if (x != 1 && x != 2) {
			encerrar("OTARIO");
		}

		System.out.println("Escolha qual bebida deseja:\n1 - Coca-cola\n2 - Suco de uva\n3 - Milkshake");
		x = sc.nextInt();

		System.out.println("Quantos desse, campeão?");
		y = sc.nextInt();

		quantidade_bebida = y;
		if (x == 1) {
			escolhido_bebida = "Coca-cola";
			quantidade_de_itens += y;
		} else if (x == 2) {
			escolhido_bebida = "Suco de uva";
			valor_energetico += suco.getValor_energetico() * y;
			quantidade_de_itens += y;
		} else if (x == 3) {
			escolhido_bebida = "Milk Shake";
			valor_energetico += milk_shake.getValor_energetico() * y;
			quantidade_de_itens += y;
		} else {
			encerrar("OTARIO");
		}

		System.out.println("Escolha o tamanho do copo desejado:\n1 - 300 mL\n2 - 500 mL\n3 - 700 mL");
		x = sc.nextInt();

		if (x != 1 && x != 2 && x != 3)
			encerrar("OTARIO");
		else if (x == 1) {
			volume_escolhido = 300;
			if (escolhido_bebida.equals("Coca-cola")) {
				cocacola.setVolume(300);
				cocacola.setPreco(preco * 0.8);
				preco += cocacola.getPreco() * y;
				valor_energetico += (cocacola.getValor_energetico() * y) * 0.8;
			} else if (escolhido_bebida.equals("Suco")) {
				suco.setVolume(300);
				suco.setPreco(preco * 0.8);
				preco += suco.getPreco() * y;
				valor_energetico += (suco.getValor_energetico() * y) * 0.8;
			} else if (escolhido_bebida.equals("Milk Shake")) {
				milk_shake.setVolume(300);
				milk_shake.setPreco(preco * 0.8);
				preco += milk_shake.getPreco() * y;
				valor_energetico += (milk_shake.getValor_energetico() * y) * 0.8;
			}
		}

		else if (x == 2) {
			volume_escolhido = 500;
			if (escolhido_bebida.equals("Coca-cola")) {
				cocacola.setVolume(500);
				cocacola.setPreco(preco * 1);
				preco += cocacola.getPreco() * y;
				valor_energetico += (cocacola.getValor_energetico() * y) * 1;
			} else if (escolhido_bebida.equals("Suco")) {
				suco.setVolume(500);
				suco.setPreco(preco * 1);
				preco += suco.getPreco() * y;
				valor_energetico += (suco.getValor_energetico() * y) * 1;
			} else if (escolhido_bebida.equals("Milk Shake")) {
				milk_shake.setVolume(500);
				milk_shake.setPreco(preco * 1);
				preco += milk_shake.getPreco() * y;
				valor_energetico += (milk_shake.getValor_energetico() * y) * 1;
			}
		}

		else if (x == 3) {
			volume_escolhido = 700;
			if (escolhido_bebida.equals("Coca-cola")) {
				cocacola.setVolume(700);
				cocacola.setPreco(preco * 1.2);
				preco += cocacola.getPreco() * y;
				valor_energetico += (cocacola.getValor_energetico() * y) * 1.2;
			} else if (escolhido_bebida.equals("Suco")) {
				suco.setVolume(700);
				suco.setPreco(preco * 1.2);
				preco += suco.getPreco() * y;
				valor_energetico += (suco.getValor_energetico() * y) * 1.2;
			} else if (escolhido_bebida.equals("Milk Shake")) {
				milk_shake.setVolume(700);
				milk_shake.setPreco(preco * 1.2);
				preco += milk_shake.getPreco() * y;
				valor_energetico += (milk_shake.getValor_energetico() * y) * 1.2;
			}
		}

		System.out.println("Deseja a bebida com gelo?\n1 - sim\n2 - não");
		x = sc.nextInt();

		if (x == 1) {
			if (escolhido_bebida.equals("Coca-cola")) {
				cocacola.setGelo(true);
			} else if (escolhido_bebida.equals("Suco de uva")) {
				suco.setGelo(true);
			} else if (escolhido_bebida.equals("Milk Shake")) {
				milk_shake.setGelo(true);
			}
		} else if (x == 2) {
			if (escolhido_bebida.equals("Coca-cola")) {
				cocacola.setGelo(false);
			} else if (escolhido_bebida.equals("Suco de uva")) {
				suco.setGelo(false);
			} else if (escolhido_bebida.equals("Milk Shake")) {
				milk_shake.setGelo(false);
			}
		} else {
			encerrar("OTARIO");
		}
		
		List<Integer> total_itens = Arrays.asList(quantidade_de_itens);
		Collections.sort(total_itens);
		

		System.out.println("---------------------------------");
		System.out.println("Aqui estão as informações do seu pedido:\n");
		System.out.println("|Lanche:                   " + escolhido_lanche);
		System.out.println("|Quantidade:                 " + quantidade_lanche);
		System.out.println("|Tipo de carne:            " + Carne);
		if (Bigmac.isSalada() == true || Mcchicken.isSalada() == true || Mcfish.isSalada() == true) {
			System.out.println("|Salada:          	      Sim");
		} else {
			System.out.println("|Salada:          	      Não");
		}

		if (Bigmac.isAcompanhamento() == true || Mcchicken.isAcompanhamento() == true
				|| Mcfish.isAcompanhamento() == true) {
			System.out.println("|Acompanhamento:              Sim");
		} else {
			System.out.println("|Acompanhamento:              Não");
		}

		if (Bigmac.isMolho() == true || Mcchicken.isMolho() == true || Mcfish.isMolho() == true) {
			System.out.println("|Molho:                       Sim");
		} else {
			System.out.println("|Molho:                       Não");
		}

		if (escolhido_lanche.equals("Bigmac")) {
			System.out.print("|Peso total dos lanches:    " + Bigmac.getPeso() * quantidade_lanche + " g\n");
		} else if (escolhido_lanche.equals("Mcchicken")) {
			System.out.print("|Peso total dos lanches:    " + Mcchicken.getPeso() * quantidade_lanche + " g\n");
		} else if (escolhido_lanche.equals("Mcfish")) {
			System.out.print("|Peso total dos lanches:    " + Mcfish.getPeso() * quantidade_lanche + " g\n");
		}

		if (escolhido_bebida.equals("Coca-cola")) {
			System.out.println("|Bebida:                " + cocacola.getTipo() + "-" + cocacola.getSabor());
		} else if (escolhido_bebida.equals("Suco")) {
			System.out.println("|Bebida:                " + suco.getTipo() + "-" + suco.getSabor());
		} else if (escolhido_bebida.equals("Milk Shake")) {
			System.out.println("|Bebida:                " + milk_shake.getTipo() + "-" + milk_shake.getSabor());
		}

		System.out.println("|Quantidade de bebidas:          " + quantidade_bebida);
		System.out.print("|Volume total:             " + volume_escolhido * quantidade_bebida + " mL\n");

		if (escolhido_bebida.equals("Coca-cola") && cocacola.isGelo() == true
				|| escolhido_bebida.equals("Suco de uva") && suco.isGelo() == true) {
			System.out.println("|Gelo:                        Sim");
		} else if (escolhido_bebida.equals("Milk Shake") && milk_shake.isGelo() == true) {
			System.out.println("|GELO NO MILKSHAKE? VOCÊ É DOENTE?");
		} else {
			System.out.println("|Gelo:                        Não");
		}
		
		System.out.println("|Total de itens:             " + total_itens);
		System.out.println("|Valor energético:       " + valor_energetico + " Kcal");
		System.out.println("|********************************");
		System.out.print("|Preço total              R$" + preco + "\n");

		sc.close();
		encerrar(1);
	}

	public static void encerrar(int num) {
		System.out.println(" Obrigado pela preferência!");
		System.exit(0);
	}

	public static void encerrar(String ota) {
		System.out.println(ota);
		System.exit(0);
	}
	
}