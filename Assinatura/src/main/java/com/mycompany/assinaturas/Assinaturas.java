/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assinaturas;

import javax.swing.ImageIcon;

/**
 *
 * @author gustavo.lima
 */
public class Assinaturas {

        public void preencherRu(){
            
            telaAssinaturas ta = new telaAssinaturas();
            
            String email = ta.jTextField2.getText();
            String nome = ta.nomeTextField.getText();
            String ramal = ta.RamalTextField.getText();
            String area = ta.areaTextField.getText();
            
            //Rubberon
            TelaDois tdois = new TelaDois();
            tdois.areaLabelRu1.setText(area);
            tdois.emailLabelRU.setText("    " + email + "@rubberon.com.br");
            tdois.nomeLabelRu1.setText(nome);
        
            if (ta.DataDeNacimentoFormattedTextField.getText().equals("(  )       -    ")){
                //telas.telefoneLabelRu5.setText(null);
                tdois.zapLabelRU.setText("    Sem Numero");
            }else{
            tdois.telefoneLabelRU.setText("    + 55 (11) 4344-1500 R." + ramal);
            
            }
        }   
        public void image(){
            TelaDois tdois = new TelaDois();
            
            //if(tdois.EmpresasjComboBox.getSelectedItem().equals("Rubberon")){
                //ImageIcon imgRu = new ImageIcon(getClass().getResource("/Logos/Assinatra2.2.PNG"));

                //tdois.jLabel2.setIcon(imgRu);
            //}
            
            
            
        }
}
