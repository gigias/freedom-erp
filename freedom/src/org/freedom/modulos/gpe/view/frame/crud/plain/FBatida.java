/**
 * @version 04/07/2011 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.gpe.view.frame.crud.plain <BR>
 *         Classe:
 * @(#)FBatida.java <BR>
 * 
 *                Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *                modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *                na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *                Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *                sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *                Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *                Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *                de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *                Formul�rio para cadastro de batidas de ponto.
 * 
 */

package org.freedom.modulos.gpe.view.frame.crud.plain;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.Vector;

import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JComboBoxPad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FDados;
import org.freedom.library.type.TYPE_PRINT;
import org.freedom.modulos.gpe.business.object.Batida;
import org.freedom.modulos.gpe.dao.DAOBatida;
import org.freedom.modulos.grh.view.frame.crud.plain.FTurnos;

public class FBatida extends FDados implements InsertListener, KeyListener {

	private static final long serialVersionUID = 1L;

	private final JTextFieldPad txtMatempr = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 6, 0 );
	
	private final JTextFieldFK txtNomeempr = new JTextFieldFK( JTextFieldFK.TP_STRING, 50, 0);
	
	private final JTextFieldPad txtDtbat = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtHbat = new JTextFieldPad( JTextFieldPad.TP_TIME, 5, 0 );

	private final Vector<String> labels = new Vector<String>();
	
	private final Vector<String> values = new Vector<String>();

	private JComboBoxPad cbTipobat = null;
	
	private final ListaCampos lcEmpr = new ListaCampos(this, "EP");
	
	private DAOBatida daobatida = null; 
	
	public FBatida() {

		super();
		setTitulo( "Digita��o de Livro Ponto" );
		setAtribos( 50, 50, 500, 300 );
		
		montaListaCampos();

		montaTela();

		lcCampos.addInsertListener( this );
		btImp.addActionListener( this );
		btPrevimp.addActionListener( this );
		txtHbat.addKeyListener( this );
		setImprimir( true );
	}

	private void montaTela() {

		
		labels.addElement( "Livro ponto (Manual)" );
		labels.addElement( "Ponto eletr�nico" );
		
		values.addElement( "M" );
		values.addElement( "E" );
		
		cbTipobat = new JComboBoxPad( labels, values, JComboBoxPad.TP_STRING, 1, 0 );
		cbTipobat.setEnabled( false );
		
		adicCampo( txtDtbat, 7, 20, 90, 20, "Dtbat", "Data", ListaCampos.DB_PK, true );
		adicCampo( txtHbat, 100, 20, 90, 20, "Hbat", "Hor�rio", ListaCampos.DB_PK, true);
		adicDB( cbTipobat, 193, 20, 180, 20, "Tipobat", "Tipo de batida", false );
		adicCampo( txtMatempr, 7, 60, 70, 20, "Matempr", "Matr�cula", ListaCampos.DB_PF, txtNomeempr, true );
		adicDescFK( txtNomeempr, 80, 60, 300, 20, "Nomeempr", "Nome" );
		setListaCampos( true, "BATIDA", "PE" );
		lcCampos.setQueryInsert( false );
		
		
		nav.setNavigation( false );
		nav.btExcluir.setEnabled( false );
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btPrevimp ) {
			imprimir( TYPE_PRINT.VIEW );
		}
		else if ( evt.getSource() == btImp ) {
			imprimir( TYPE_PRINT.PRINT);
		}

		super.actionPerformed( evt );
	}

	private void montaListaCampos() {
		lcEmpr.add( new GuardaCampo( txtMatempr, "Matempr", "Matr�cula", ListaCampos.DB_PK, true ) );
		lcEmpr.add( new GuardaCampo( txtNomeempr, "Nomeempr", "Nome", ListaCampos.DB_SI, false ) );
		lcEmpr.montaSql( false, "EMPREGADO", "RH" );
		lcEmpr.setQueryCommit( false );
		lcEmpr.setReadOnly( true );
		txtMatempr.setTabelaExterna( lcEmpr, FTurnos.class.getCanonicalName() );

	}
	private void imprimir( TYPE_PRINT bVisualizar ) {

/*		FPrinterJob dlGr = null;
		HashMap<String, Object> hParam = new HashMap<String, Object>();

		hParam.put( "CODEMP", Aplicativo.iCodEmp );
		hParam.put( "CODFILIAL", ListaCampos.getMasterFilial( "RHAREA" ) );

		dlGr = new FPrinterJob( "relatorios/grhArea.jasper", "Lista de �reas", "", this, hParam, con, null, false );

		if ( bVisualizar==TYPE_PRINT.VIEW ) {
			dlGr.preview();
		}
		else {
			try {
				dlGr.print(true);
			} catch ( Exception e ) {
				e.printStackTrace();
				Funcoes.mensagemErro( this, "Erro na gera��o do rel�torio!" + e.getMessage(), true, con, e );
			}
		} */
	}

	public void afterInsert( InsertEvent ievt ) {

		if (ievt.getListaCampos()==lcCampos) {
			cbTipobat.setVlrString( "M" );
		}
		
	}

	public void beforeInsert( InsertEvent ievt ) {

	}
	
	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		
		lcEmpr.setConexao( cn );
		
	}
	public void keyPressed( KeyEvent kevt ) {
		if ( ( kevt.getKeyCode() == KeyEvent.VK_ENTER ) && ( kevt.getSource() == txtMatempr ) && (txtMatempr.getVlrInteger().intValue()>0 ) )  {
			if ( ( lcCampos.getStatus() == ListaCampos.LCS_INSERT ) || ( lcCampos.getStatus() == ListaCampos.LCS_EDIT )  ) {
				lcCampos.post();
				lcCampos.limpaCampos( true );
				txtDtbat.requestFocus();
			}
		}
	}

	public Batida carregaPonto(String aftela) {
		Batida result = null;
		daobatida = new DAOBatida( con );
		try {
			daobatida.setPrefs( Aplicativo.iCodEmp, ListaCampos.getMasterFilial( "SGPREFERE3" ) );
			result = daobatida.carregaPonto(Aplicativo.iCodEmp, ListaCampos.getMasterFilial( "SGUSUARIO" ), Aplicativo.getUsuario().getIdusu(), aftela);
		} catch ( SQLException e ) {
			Funcoes.mensagemErro( this, "Erro carregando prefer�ncias !\n" + e.getMessage() );
			e.printStackTrace();
		}
		return result;
	}
	
}
