
package core;

public class MsgConfig {

	public String Msg(String msg) {
		
		String mensagem = "";
		switch (msg) {
		case "URL":
			mensagem = "http://hml3-naturahml.sysmap.com.br/gcpweb/pages/home/";
			break;
		case "DataPath":
			mensagem = "E:/RegressaoGCP/RegressaoGCP/RegressaoGCP/Data/users.xlsx";
			break;
		case "ScreeDir":
			mensagem = "E:/RegressaoGCP/UnitTestProject1/UnitTestProject1";
			break;
		case "MsgAprova":
			mensagem = " Registros aprovados com sucesso!";
			break;
		case "MsgAprovaLog":
			mensagem = " Registro aprovado com sucesso!";
			break;
		case "MsgAprovaPreco":
			mensagem = " Aprova��o solicitada com sucesso! Aguarde a finaliza��o do processamento.";
			break;
		case "MsgCancelaPreco":
			mensagem = " Cancelamento solicitado com sucesso! Aguarde a finaliza��o do processamento.";
			break;
		case "MsgCancel":
			mensagem = " Registros cancelados com sucesso!";
			break;
		case "MsgCancelLog":
			mensagem = " Registro cancelado com sucesso!";
			break;
		case "MsgExclui":
			mensagem = " Registros exclu�dos com sucesso!";
			break;
		case "MsgInclui":
			mensagem = " Registro salvo com sucesso!";
			break;
		case "Excel":
			mensagem = "c:\\users.xlsx";
			break;
		}

		return mensagem;
	}

}
