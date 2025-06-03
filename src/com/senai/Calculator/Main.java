package com.senai.Calculator;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.ArrayList;

public class Main {
//	Variaveis do Frame e operações
	static double a,b, resultado;
	static boolean resultadobool = false;
	static String[] vet;
	static ArrayList<String> lista = new ArrayList<>(); // ArrayList de
	static JTextField caixaTexto = new JTextField();
	
//	Variaveis do Login
	static User user = new User(null, null);
	static Login login = new Login();
	
	private static boolean jaTemOperador(String texto) {
	    return texto.contains("+") || texto.contains("-") || texto.contains("X") || texto.contains("/");
	}
	
	public static void frame() { //Tela principal:: Calculadora
		JFrame frame = new JFrame();	
		JPanel painel = new JPanel();
		
		
		//***************************
		JButton botaoC = new JButton("C");
		JButton botaoDivisao = new JButton("/");
		JButton botaoMult = new JButton("X");
		JButton botaoSub = new JButton("-");
		JButton botaoSoma = new JButton("+");
		JButton botaoIgual = new JButton("=");
		JButton botao7 = new JButton("7");
		JButton botao8 = new JButton("8");
		JButton botao9 = new JButton("9");
		JButton botao4 = new JButton("4");
		JButton botao5 = new JButton("5");
		JButton botao6 = new JButton("6");
		JButton botao1 = new JButton("1");
		JButton botao2 = new JButton("2");
		JButton botao3 = new JButton("3");
		JButton botao0 = new JButton("0");
		JButton botaoPonto = new JButton(".");
		JButton backSpace = new JButton("<-");
		JButton botaoHistorico = new JButton("Historico");
		JButton botaoSair = new JButton("Sair");
		//***************************
		
		
		frame.setSize(400,600);
		frame.setResizable(false);
		painel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(painel);
		
		caixaTexto.setEditable(false);
		
		caixaTexto.setBounds(30, 30, 325, 70);
		botaoHistorico.setBounds(30, 5, 100, 20);
		caixaTexto.setHorizontalAlignment(JTextField.RIGHT);
		caixaTexto.setFont(new Font("Arial", 0, 24));
		caixaTexto.setVisible(true);
		
		botaoC.setBounds(30, 120, 70, 70);
		botaoDivisao.setBounds(115, 120, 70, 70);
		botaoMult.setBounds(200, 120, 70, 70);
		botaoSub.setBounds(285, 120, 70, 70);
		botaoSoma.setBounds(285, 210, 70, 160);
		botaoIgual.setBounds(285, 390, 70, 160);
		botao7.setBounds(30, 210, 70, 70);
		botao8.setBounds(115, 210, 70, 70);
		botao9.setBounds(200, 210, 70, 70);
		botao4.setBounds(30, 300, 70, 70);
		botao5.setBounds(115, 300, 70, 70);
		botao6.setBounds(200, 300, 70, 70);
		botao1.setBounds(30, 390, 70, 70);
		botao2.setBounds(115, 390, 70, 70);
		botao3.setBounds(200, 390, 70, 70);
		botao0.setBounds(115, 480, 70, 70);
		botaoPonto.setBounds(200, 480, 70, 70);
		backSpace.setBounds(30, 480, 70, 70);
		botaoSair.setBounds(255, 5, 100, 20);
		botaoC.setVisible(true);
		botaoHistorico.setOpaque(true);
		
		painel.add(botaoC);
		painel.add(botaoDivisao);
		painel.add(botaoMult);
		painel.add(botaoSub);
		painel.add(botaoSoma);
		painel.add(botaoIgual);
		painel.add(botao7);
		painel.add(botao8);
		painel.add(botao9);
		painel.add(botao4);
		painel.add(botao5);
		painel.add(botao6);
		painel.add(botao1);
		painel.add(botao2);
		painel.add(botao3);
		painel.add(botao0);
		painel.add(botaoPonto);		
		painel.add(caixaTexto);
		painel.add(botaoC);
		painel.add(backSpace);
		painel.add(botaoHistorico);
		painel.add(botaoSair);
		
		frame.setVisible(true);		
		
		botaoIgual.addActionListener(e -> { 
			calculo(caixaTexto.getText());
		});
		
		botaoC.addActionListener(e -> caixaTexto.setText(""));
		
		botaoDivisao.addActionListener(e -> {
		    resultadobool=false;
		    String text = caixaTexto.getText();
		    if(!text.isEmpty() && !jaTemOperador(text)) {    
		        caixaTexto.setText(text + "/");
		    }
		});
		
		botaoMult.addActionListener(e -> {
		    resultadobool=false;
		    String text = caixaTexto.getText();
		    if(!text.isEmpty() && !jaTemOperador(text)) {    
		        caixaTexto.setText(text + "X");
		    }
		});
		
		botaoSub.addActionListener(e -> {
		    resultadobool=false;
		    String text = caixaTexto.getText();
		    if(!text.isEmpty() && !jaTemOperador(text)) {    
		        caixaTexto.setText(text + "-");
		    }
		});
		
		botaoSoma.addActionListener(e -> {
		    resultadobool=false;
		    String text = caixaTexto.getText();
		    if(!text.isEmpty() && !jaTemOperador(text)) {    
		        caixaTexto.setText(text + "+");
		    }
		});

		

		botao7.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "7");
			resultadobool=false;
		});
		botao8.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "8");
			resultadobool=false;	
		});
		botao9.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "9");
			resultadobool=false;	
		});

		botao4.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "4");
			resultadobool=false;	
		});
		botao5.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "5");
			resultadobool=false;	
		});
		botao6.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "6");
			resultadobool=false;	
		});

		botao1.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "1");
			resultadobool=false;	
		});
		botao2.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "2");
			resultadobool=false;	
		});
		botao3.addActionListener(e -> {
			if(resultadobool==true) {caixaTexto.setText("");}
			caixaTexto.setText(caixaTexto.getText() + "3");
			resultadobool=false;	
		});

		botao0.addActionListener(e -> {caixaTexto.setText(caixaTexto.getText() + "0");
		resultadobool=false;
		});
		botaoPonto.addActionListener(e -> caixaTexto.setText(caixaTexto.getText() + "."));

		backSpace.addActionListener(e -> {
		    String text = caixaTexto.getText();
		    if (!text.isEmpty()) {
		        caixaTexto.setText(text.substring(0, text.length() - 1));
		    }
		});

		botaoHistorico.addActionListener(e -> {
		    System.out.println("Abrir histórico");
		    frame2();
		});
		
		botaoSair.addActionListener(e -> {
			caixaTexto.setText("");
			frame.dispose();
			loginFrame();
		});

		
	}
	
	
	public static void frame2() { //Tela Historico
		JFrame frame = new JFrame("Historico");	
		JPanel painel = new JPanel();
		JLabel historico = new JLabel();
		frame.setSize(400,400);
		frame.setResizable(false);
		painel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(painel);
		painel.add(historico);
		
		
		
		String[] coluna = {"Calculos"};
		
		java.util.List<String> historicoList = user.getHistorico().getCalculos();
		String[][] dados = new String[historicoList.size()][1];
		int i = 0;
		for(String dado : historicoList) {
		    dados[i][0] = dado;
		    i++;
		}

		
		JTable tabela = new JTable(dados, coluna);
		tabela.setLayout(null);
		tabela.setBounds(5, 5, 260, 390);
		tabela.setDefaultEditor(Object.class, null);
		
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(5, 5, 260, 390);
		frame.add(scrollPane);
		
		frame.setVisible(true);
		
	}
	
	//Metodos de calculos:
	
	//Calculo 1: 	
	public static void calculo(String calc) {
		calc = calc.replaceAll("=", "");
		String[] vet;
		double resultado = 0;
		
		if(calc.contains("+")) {
			vet = calc.split("\\+");
			resultado = Double.parseDouble(vet[0]) + Double.parseDouble(vet[1]);
			
		}else if(calc.contains("-")) {
			vet = calc.split("-");
			resultado = Double.parseDouble(vet[0]) - Double.parseDouble(vet[1]);
			
		}else if(calc.contains("X")) {
			vet = calc.split("X");
			resultado = Double.parseDouble(vet[0]) * Double.parseDouble(vet[1]);
			
		}else if(calc.contains("/")) {
			vet = calc.split("/");
			resultado = Double.parseDouble(vet[0]) / Double.parseDouble(vet[1]);
			
		}else {
			System.out.print("ERRO!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
		}
		caixaTexto.setEditable(true);
		user.getHistorico().adicionarCalculo(calc + "=" + String.valueOf(resultado));
		System.out.println(calc + "=" + String.valueOf(resultado));
		caixaTexto.setText(String.valueOf(resultado));
		resultadobool = true;
		caixaTexto.setEditable(false);
	}
	
//	Metodo Frame Login
	
	public static void loginFrame() {
		JButton botaoEntrar = new JButton("Entrar");
		JButton botaoCriar = new JButton("Criar Conta");
		JTextField nameInput = new JTextField();
		JPasswordField passwordInput = new JPasswordField();
		
		botaoEntrar.setBounds(140, 95, 100, 20);
		botaoCriar.setBounds(140, 125, 100, 20);

		JFrame frame = new JFrame();	
		JPanel painel = new JPanel();
		
		frame.setSize(400,200);
		frame.setResizable(false);
		painel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(painel);
		
		nameInput.setEditable(true);		
		nameInput.setBounds(90, 30, 195, 20);		
		nameInput.setHorizontalAlignment(JTextField.LEFT);
		nameInput.setFont(new Font("Arial", 0, 11));
		nameInput.setVisible(true);
		
		passwordInput.setEditable(true);		
		passwordInput.setBounds(90, 60, 195, 20);		
		passwordInput.setHorizontalAlignment(JTextField.LEFT);
		passwordInput.setEchoChar('*');
		passwordInput.setFont(new Font("Arial", 0, 11));
		passwordInput.setVisible(true);
		
		painel.add(botaoCriar);
		painel.add(botaoEntrar);
		painel.add(nameInput);
		painel.add(passwordInput);
		
		frame.setVisible(true);	
		
//		ActionListeners
		
		botaoEntrar.addActionListener(e -> {
		    User authenticated = login.loginVerify(nameInput.getText(), new String(passwordInput.getPassword()));
		    if (authenticated != null) {
		        user = authenticated;
		        frame();
		        frame.dispose(); // fecha a tela de login
		    } else {
		        JOptionPane.showMessageDialog(null, "Username ou Senha estão incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
		    }
		});
		
		botaoCriar.addActionListener(e -> {
//			String usuario;
//			String senha;
			JTextField userField = new JTextField();
			JPasswordField passField = new JPasswordField();
			Object[] inputs = { "Nome de Usuário:", userField, "Senha:", passField };

			int opcao = JOptionPane.showConfirmDialog(null, inputs, "Login", JOptionPane.OK_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
//			    usuario = userField.getText();
//			    senha = new String(passField.getPassword());			    
				login.setUserInList(new User(userField.getText(), new String(passField.getPassword())));
				login.viewUsers();
			}
		});		
	}
	
	public static void main(String[] args) {
		loginFrame();
//		frame();
	}
}