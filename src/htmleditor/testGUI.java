/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package htmleditor;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author ldc1108 (Luke Coy), drn5447 (Danielle Neuberger)
 */
public class testGUI extends javax.swing.JFrame {

    ArrayList<Buffer> buffers = new ArrayList<>();
    
    /**
     * Creates new form testGUI
     */
    public testGUI() {
        this.currBuff = new Buffer(currentTab,"");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newFileMenuItem = new javax.swing.JMenuItem();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveAsMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        CutMenuItem = new javax.swing.JMenuItem();
        CopyMenuItem = new javax.swing.JMenuItem();
        PasteMenuItem = new javax.swing.JMenuItem();
        ViewMenu = new javax.swing.JMenu();
        ViewAsWebpageMenuItem = new javax.swing.JMenuItem();
        ZoomToMenu = new javax.swing.JMenu();
        FiftyPercentZoom = new javax.swing.JMenuItem();
        OneHundredPercentZoom = new javax.swing.JMenuItem();
        TwoHundredPercentZoom = new javax.swing.JMenuItem();
        OptionsMenu = new javax.swing.JMenu();
        AutoWordWrapMenuCheckBox = new javax.swing.JCheckBoxMenuItem();
        AutoIndentMenuCheckBox = new javax.swing.JCheckBoxMenuItem();
        SyntaxHighlightingMenuCheckbox = new javax.swing.JCheckBoxMenuItem();
        IndentCurrentLineMenuItem = new javax.swing.JMenuItem();
        IndentSelectedTextMenuItem = new javax.swing.JMenuItem();
        IndentEntireBufferMenuItem = new javax.swing.JMenuItem();
        InsertMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        h1Header = new javax.swing.JMenuItem();
        h2Header = new javax.swing.JMenuItem();
        h3Header = new javax.swing.JMenuItem();
        h4Header = new javax.swing.JMenuItem();
        h5Header = new javax.swing.JMenuItem();
        h6Header = new javax.swing.JMenuItem();
        TableMenuItem = new javax.swing.JMenuItem();
        ListMenuItem = new javax.swing.JMenuItem();
        FontEmphasisMenu = new javax.swing.JMenu();
        BoldMenuItem = new javax.swing.JMenuItem();
        ItalicMenuItem = new javax.swing.JMenuItem();
        UnderlineMenuItem = new javax.swing.JMenuItem();
        ParagraphMenuItem = new javax.swing.JMenuItem();
        PictureMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });
        tabs.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tabsComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tabsComponentRemoved(evt);
            }
        });
        tabs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabsFocusGained(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        tabs.addTab("File1", jScrollPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        FileMenu.setText("File");

        newFileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-new-icon.png"))); // NOI18N
        newFileMenuItem.setText("New");
        newFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(newFileMenuItem);

        OpenMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Folder-Open-icon.png"))); // NOI18N
        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenuItem);

        SaveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-icon.png"))); // NOI18N
        SaveMenuItem.setText("Save");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveMenuItem);

        SaveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-as-icon.png"))); // NOI18N
        SaveAsMenuItem.setText("Save As");
        SaveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveAsMenuItem);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        CutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        CutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-edit-cut-icon.png"))); // NOI18N
        CutMenuItem.setText("Cut");
        CutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(CutMenuItem);

        CopyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CopyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-edit-copy-icon.png"))); // NOI18N
        CopyMenuItem.setText("Copy");
        CopyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(CopyMenuItem);

        PasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        PasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paste-icon.png"))); // NOI18N
        PasteMenuItem.setText("Paste");
        PasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(PasteMenuItem);

        jMenuBar1.add(EditMenu);

        ViewMenu.setText("View");

        ViewAsWebpageMenuItem.setText("View As Webpage");
        ViewAsWebpageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAsWebpageMenuItemActionPerformed(evt);
            }
        });
        ViewMenu.add(ViewAsWebpageMenuItem);

        ZoomToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Zoom-In-icon.png"))); // NOI18N
        ZoomToMenu.setText("Zoom To..");

        FiftyPercentZoom.setText("50%");
        FiftyPercentZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiftyPercentZoomActionPerformed(evt);
            }
        });
        ZoomToMenu.add(FiftyPercentZoom);

        OneHundredPercentZoom.setText("100%");
        OneHundredPercentZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneHundredPercentZoomActionPerformed(evt);
            }
        });
        ZoomToMenu.add(OneHundredPercentZoom);

        TwoHundredPercentZoom.setText("200%");
        TwoHundredPercentZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoHundredPercentZoomActionPerformed(evt);
            }
        });
        ZoomToMenu.add(TwoHundredPercentZoom);

        ViewMenu.add(ZoomToMenu);

        jMenuBar1.add(ViewMenu);

        OptionsMenu.setText("Options");

        AutoWordWrapMenuCheckBox.setSelected(true);
        AutoWordWrapMenuCheckBox.setText("Auto Word Wrap");
        AutoWordWrapMenuCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoWordWrapMenuCheckBoxActionPerformed(evt);
            }
        });
        OptionsMenu.add(AutoWordWrapMenuCheckBox);

        AutoIndentMenuCheckBox.setSelected(true);
        AutoIndentMenuCheckBox.setText("Auto Indent");
        AutoIndentMenuCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoIndentMenuCheckBoxActionPerformed(evt);
            }
        });
        OptionsMenu.add(AutoIndentMenuCheckBox);

        SyntaxHighlightingMenuCheckbox.setSelected(true);
        SyntaxHighlightingMenuCheckbox.setText("Syntax Highlighting");
        SyntaxHighlightingMenuCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyntaxHighlightingMenuCheckboxActionPerformed(evt);
            }
        });
        OptionsMenu.add(SyntaxHighlightingMenuCheckbox);

        IndentCurrentLineMenuItem.setText("Indent Current Line");
        IndentCurrentLineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndentCurrentLineMenuItemActionPerformed(evt);
            }
        });
        OptionsMenu.add(IndentCurrentLineMenuItem);

        IndentSelectedTextMenuItem.setText("Indent Selected Text");
        IndentSelectedTextMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndentSelectedTextMenuItemActionPerformed(evt);
            }
        });
        OptionsMenu.add(IndentSelectedTextMenuItem);

        IndentEntireBufferMenuItem.setText("Indent Entire Buffer");
        IndentEntireBufferMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndentEntireBufferMenuItemActionPerformed(evt);
            }
        });
        OptionsMenu.add(IndentEntireBufferMenuItem);

        jMenuBar1.add(OptionsMenu);

        InsertMenu.setText("Insert");

        jMenu1.setText("Header");

        h1Header.setText("<h1>");
        h1Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h1Header);

        h2Header.setText("<h2>");
        h2Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h2Header);

        h3Header.setText("<h3>");
        h3Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h3Header);

        h4Header.setText("<h4>");
        h4Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h4Header);

        h5Header.setText("<h5>");
        h5Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h5Header);

        h6Header.setText("<h6>");
        h6Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6HeaderActionPerformed(evt);
            }
        });
        jMenu1.add(h6Header);

        InsertMenu.add(jMenu1);

        TableMenuItem.setText("Table");
        TableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableMenuItemActionPerformed(evt);
            }
        });
        InsertMenu.add(TableMenuItem);

        ListMenuItem.setText("List");
        ListMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListMenuItemActionPerformed(evt);
            }
        });
        InsertMenu.add(ListMenuItem);

        FontEmphasisMenu.setText("Font Emphasis");

        BoldMenuItem.setText("Bold");
        BoldMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoldMenuItemActionPerformed(evt);
            }
        });
        FontEmphasisMenu.add(BoldMenuItem);

        ItalicMenuItem.setText("Italic");
        ItalicMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicMenuItemActionPerformed(evt);
            }
        });
        FontEmphasisMenu.add(ItalicMenuItem);

        UnderlineMenuItem.setText("Underline");
        UnderlineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnderlineMenuItemActionPerformed(evt);
            }
        });
        FontEmphasisMenu.add(UnderlineMenuItem);

        InsertMenu.add(FontEmphasisMenu);

        ParagraphMenuItem.setText("Paragraph");
        ParagraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParagraphMenuItemActionPerformed(evt);
            }
        });
        InsertMenu.add(ParagraphMenuItem);

        PictureMenuItem.setText("Picture");
        PictureMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureMenuItemActionPerformed(evt);
            }
        });
        InsertMenu.add(PictureMenuItem);

        jMenuBar1.add(InsertMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Buffer currBuff;
    private int currentTab;
    private JTextArea currentTextArea;
    private String selectedText;
    
    private void PasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteMenuItemActionPerformed
        jTextArea1.insert(selectedText, jTextArea1.getCaretPosition());
    }//GEN-LAST:event_PasteMenuItemActionPerformed

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        currBuff.updateContents(jTextArea1.getText());
        //have Buffer notify editor that it's contents have changed
    }//GEN-LAST:event_SaveMenuItemActionPerformed

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void newFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileMenuItemActionPerformed
        // TODO add your handling code here:
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(textArea);
        tabs.add("New Buffer", scrollPane);
        currentTextArea = textArea;
    }//GEN-LAST:event_newFileMenuItemActionPerformed

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
        // TODO add your handling code here:
       //currentTextArea = this area
        // get the observable buffer
        //  update(string) on the bufffer
        //      -> w/i update do the stuff below
        
        // get observers: addObserver()

        
        
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void tabsComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabsComponentAdded
        //executes whenever a new tab is created
        Buffer tabBuff = new Buffer(buffers.size()+1, "");
        buffers.add(tabBuff);
        currentTab = tabs.getSelectedIndex();
    }//GEN-LAST:event_tabsComponentAdded

    private void TableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMenuItemActionPerformed

    private void AutoWordWrapMenuCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoWordWrapMenuCheckBoxActionPerformed
        // TODO add your handling code here:
        if (AutoWordWrapMenuCheckBox.isSelected()){
            currentTextArea.setLineWrap(true);
            //jTextArea1.setWrapStyleWord(true);
        }
        else{
            currentTextArea.setLineWrap(false);
           // jTextArea1.setWrapStyleWord(false);
        }
    }//GEN-LAST:event_AutoWordWrapMenuCheckBoxActionPerformed

    private void tabsComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabsComponentRemoved
       //TODO: save stuff to buffer
       //have buffer pass it's stuff to the editor      
    }//GEN-LAST:event_tabsComponentRemoved

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        //set the currentTextArea and currentTab
    }//GEN-LAST:event_tabsStateChanged

    private void CopyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyMenuItemActionPerformed
        selectedText = jTextArea1.getSelectedText();
    }//GEN-LAST:event_CopyMenuItemActionPerformed

    private void CutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutMenuItemActionPerformed
        selectedText = jTextArea1.getSelectedText();
        int start = jTextArea1.getSelectionStart();
        int end = jTextArea1.getSelectionEnd();
        jTextArea1.replaceRange("", start, end);   
       // jTextArea1.setText(jTextArea1.getText().replace(jTextArea1.getSelectedText(),""));
    }//GEN-LAST:event_CutMenuItemActionPerformed

    private void SaveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveAsMenuItemActionPerformed

    private void ViewAsWebpageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAsWebpageMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAsWebpageMenuItemActionPerformed

    private void FiftyPercentZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiftyPercentZoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiftyPercentZoomActionPerformed

    private void OneHundredPercentZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneHundredPercentZoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OneHundredPercentZoomActionPerformed

    private void TwoHundredPercentZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoHundredPercentZoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TwoHundredPercentZoomActionPerformed

    private void AutoIndentMenuCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoIndentMenuCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoIndentMenuCheckBoxActionPerformed

    private void SyntaxHighlightingMenuCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyntaxHighlightingMenuCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SyntaxHighlightingMenuCheckboxActionPerformed

    private void IndentCurrentLineMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndentCurrentLineMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndentCurrentLineMenuItemActionPerformed

    private void IndentSelectedTextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndentSelectedTextMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndentSelectedTextMenuItemActionPerformed

    private void IndentEntireBufferMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndentEntireBufferMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndentEntireBufferMenuItemActionPerformed

    private void ListMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListMenuItemActionPerformed

    private void BoldMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldMenuItemActionPerformed
        // TODO add your handling code here:
       // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<b>\n     \n</b>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_BoldMenuItemActionPerformed

    private void ItalicMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicMenuItemActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<i>\n     \n</i>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_ItalicMenuItemActionPerformed

    private void UnderlineMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnderlineMenuItemActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<u>\n     \n</u>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_UnderlineMenuItemActionPerformed

    private void ParagraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParagraphMenuItemActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<p>\n     \n</p>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_ParagraphMenuItemActionPerformed

    private void PictureMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PictureMenuItemActionPerformed

    private void tabsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tabsFocusGained

    private void h3HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3HeaderActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h3>\n     \n</h3>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h3HeaderActionPerformed

    private void h1HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1HeaderActionPerformed
       // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h1>\n     \n</h1>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h1HeaderActionPerformed

    private void h2HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2HeaderActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h2>\n     \n</h2>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h2HeaderActionPerformed

    private void h4HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4HeaderActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h4>\n     \n</h4>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h4HeaderActionPerformed

    private void h5HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5HeaderActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h5>\n     \n</h5>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h5HeaderActionPerformed

    private void h6HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6HeaderActionPerformed
        // int pos = currentTextArea.getCaretPosition();
        jTextArea1.insert("<h6>\n     \n</h6>", jTextArea1.getCaretPosition());
    }//GEN-LAST:event_h6HeaderActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem AutoIndentMenuCheckBox;
    private javax.swing.JCheckBoxMenuItem AutoWordWrapMenuCheckBox;
    private javax.swing.JMenuItem BoldMenuItem;
    private javax.swing.JMenuItem CopyMenuItem;
    private javax.swing.JMenuItem CutMenuItem;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem FiftyPercentZoom;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu FontEmphasisMenu;
    private javax.swing.JMenuItem IndentCurrentLineMenuItem;
    private javax.swing.JMenuItem IndentEntireBufferMenuItem;
    private javax.swing.JMenuItem IndentSelectedTextMenuItem;
    private javax.swing.JMenu InsertMenu;
    private javax.swing.JMenuItem ItalicMenuItem;
    private javax.swing.JMenuItem ListMenuItem;
    private javax.swing.JMenuItem OneHundredPercentZoom;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenu OptionsMenu;
    private javax.swing.JMenuItem ParagraphMenuItem;
    private javax.swing.JMenuItem PasteMenuItem;
    private javax.swing.JMenuItem PictureMenuItem;
    private javax.swing.JMenuItem SaveAsMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JCheckBoxMenuItem SyntaxHighlightingMenuCheckbox;
    private javax.swing.JMenuItem TableMenuItem;
    private javax.swing.JMenuItem TwoHundredPercentZoom;
    private javax.swing.JMenuItem UnderlineMenuItem;
    private javax.swing.JMenuItem ViewAsWebpageMenuItem;
    private javax.swing.JMenu ViewMenu;
    private javax.swing.JMenu ZoomToMenu;
    private javax.swing.JMenuItem h1Header;
    private javax.swing.JMenuItem h2Header;
    private javax.swing.JMenuItem h3Header;
    private javax.swing.JMenuItem h4Header;
    private javax.swing.JMenuItem h5Header;
    private javax.swing.JMenuItem h6Header;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem newFileMenuItem;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
