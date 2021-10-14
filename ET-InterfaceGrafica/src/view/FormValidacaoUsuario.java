package view;

import java.awt.*;

public class FormValidacaoUsuario extends Frame {

	protected Dimension dFrame, dLabel, dTextField, dButton;
	protected Button bValidar, bSair;
	protected TextField tfLogin, tfSenha;
	protected Label lLogin, lSenha;

	public FormValidacaoUsuario() {

		Dimension dFrame = new Dimension(260, 200);
		Dimension dLabel = new Dimension(45, 25);
		Dimension dTextField = new Dimension(150, 25);
		Dimension dButton = new Dimension(100, 25);

		setTitle("Validação de Usuário");
		setResizable(false);
		setSize(dFrame);
		setLocation(400, 200);
		setLayout(null);

		lLogin = new Label("Login ");
		lLogin.setSize(dLabel);
		lLogin.setLocation(25, 50);

		tfLogin = new TextField();
		tfLogin.setSize(dTextField);
		tfLogin.setLocation(75, 50);

		lSenha = new Label("Senha ");
		lSenha.setSize(dLabel);
		lSenha.setLocation(25, 100);

		tfSenha = new TextField();
		tfSenha.setSize(dTextField);
		tfSenha.setLocation(75, 100);

		bValidar = new Button("Validar");
		bValidar.setSize(dButton);
		bValidar.setLocation(25, 150);

		bSair = new Button("Sair");
		bSair.setSize(dButton);
		bSair.setLocation(130, 150);

		add(lLogin);
		add(tfLogin);
		add(lSenha);
		add(tfSenha);
		add(bValidar);
		add(bSair);
	}
}
