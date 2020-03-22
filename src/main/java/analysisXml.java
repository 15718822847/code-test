import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class analysisXml {

    public static void ax(String xml) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("");
        sb.append("<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">");
        sb.append("  <env:Header/>");
        sb.append("  <env:Body>");
        sb.append("    <getTaxpayerResponse xmlns=\"http://tistech.co.ao/ws\">");
        sb.append("      <contribuinteResponse>");
        sb.append("        <mensagem>Consulta realizada com sucesso.</mensagem>");
        sb.append("        <contribuinte>");
        sb.append("          <tipoContribuinte>TIPO5</tipoContribuinte>");
        sb.append("          <classificacaoContribuinte>COLLECTIVE</classificacaoContribuinte>");
        sb.append("          <numeroNIF>5000025879</numeroNIF>");
        sb.append("          <nomeContribuinte/>");
        //<nomeContribuinte>usaeedew</nomeContribuinte>
        sb.append("          <sexo/>");
        sb.append("          <estadoCivil/>");
        sb.append("          <nomePai/>");
        sb.append("          <nomeMae/>");
        sb.append("          <reparticaoFiscal>04.20</reparticaoFiscal>");
        sb.append("          <tipoDocumento/>");
        sb.append("          <numeroDocumento/>");
        sb.append("          <validadeDocumento/>");
        sb.append("          <provinciaDocumento/>");
        sb.append("          <provinciaMorada>LA</provinciaMorada>");
        sb.append("          <municipioMorada>BELAS</municipioMorada>");
        sb.append("          <comunaMorada>BARRA DO CUANZA</comunaMorada>");
        sb.append("          <bairroMorada>XPTO</bairroMorada>");
        sb.append("          <morada>XPTO</morada>");
        sb.append("          <complemento>XPTO</complemento>");
        sb.append("          <tipoContactoPrimario>MOBILE</tipoContactoPrimario>");
        sb.append("          <numeroContactoPrimario>927777777</numeroContactoPrimario>");
        sb.append("          <listaEmail/>");
        sb.append("          <listaContacto/>");
        sb.append("          <nomeInstituicao>XPTO</nomeInstituicao>");
        sb.append("          <razaoSocial>XPTO</razaoSocial>");
        sb.append("          <designacaoComercial>XPTO</designacaoComercial>");
        sb.append("          <naturezaJuridica>ANON</naturezaJuridica>");
        sb.append("          <dataConstituicao>2017-02-01</dataConstituicao>");
        sb.append("          <numeroDR/>");
        sb.append("          <dataDR/>");
        sb.append("          <valorCapitalSocial>1000.00</valorCapitalSocial>");
        sb.append("          <listaCAE>");
        sb.append("            <cae>");
        sb.append("              <numeroCAE>01161</numeroCAE>");
        sb.append("              <dataInicioCAE>2017-02-07</dataInicioCAE>");
        sb.append("              <dataFimCAE/>");
        sb.append("              <flagPrincipal>true</flagPrincipal>");
        sb.append("            </cae>");
        sb.append("          </listaCAE>");
        sb.append("          <nifAdministrador>0000002763</nifAdministrador>");
        sb.append("          <tipoRespAdministrador>FINR</tipoRespAdministrador>");
        sb.append("          <listaSocios/>");
        sb.append("          <nifContabilista/>");
        sb.append("          <listaFiliais/>");
        sb.append("          <estadoContribuinte>A</estadoContribuinte>");
        sb.append("          <estadoSuspensao>FALSE</estadoSuspensao>");
        sb.append("          <estadoActividade>Active</estadoActividade>");
        sb.append("          <contaPrincipal>4094424351</contaPrincipal>");
        sb.append("          <listaContasSingular/>");
        sb.append("          <listaNIFAntigos/>");
        sb.append("          <regimeIva/>");
        sb.append("          <dataInicioAtividadeIva/>");
        sb.append("          <dataFimAtividadeIva/>");
        sb.append("        </contribuinte>");
        sb.append("      </contribuinteResponse>");
        sb.append("    </getTaxpayerResponse>");
        sb.append("  </env:Body>");
        sb.append("</env:Envelope>");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new ByteArrayInputStream(sb.toString().getBytes("UTF-8")));
        Element root = doc.getRootElement();
        List<Element> list = root.elements();
        for (Element ro:list) {
            if (ro.getName().equals("Body")) {
                List<Element> list1 = ro.elements();
                for (Element roo:list1) {
                    if (roo.getName().equals("getTaxpayerResponse")) {
                        List<Element> roo1 = roo.elements();
                        for (Element x:roo1) {
                            if (x.getName().equals("contribuinteResponse")) {
                                List<Element> cons = x.elements();
                                for (Element con:cons) {
                                    if (con.getName().equals("contribuinte")) {
                                        List<Element> conbs = con.elements();
                                        for (Element conb:conbs) {
                                            if (conb.getName().equals("numeroNIF")) {
                                                System.out.println(conb.getData());
                                            }
                                            if (conb.getName().equals("nomeContribuinte")) {
                                                String a = (String) conb.getData();
                                                if (a.isEmpty()) {
                                                    System.out.println("-------------------");
                                                }
                                                System.out.println(a);
                                            }
                                            if (conb.getName().equals("provinciaMorada")) {
                                                System.out.println(conb.getData());
                                            }
                                            if (conb.getName().equals("municipioMorada")) {
                                                System.out.println(conb.getData());
                                            }
                                            if (conb.getName().equals("comunaMorada")) {
                                                System.out.println(conb.getData());
                                            }
                                            if (conb.getName().equals("morada")) {
                                                System.out.println(conb.getData());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");

        String currentDate =   dateFormat.format( new Date() );
        ax("xml");
    }
}
