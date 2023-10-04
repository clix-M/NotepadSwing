package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Notepad extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu archivoMenu, editorMenu, verMenu;
    private JMenuItem nuevaPestañaItem, nuevaVentanaItem, abrirItem, guardarItem, guardarComoItem, guardarTodoItem, configurarPaginaItem, imprimirItem, cerrarPestañaItem, guardarVentanaItem, salirItem, zoomItem, barraEstadoItem, ajusteLineaItem;

    public Notepad() {

        ImageIcon icon = new ImageIcon("src/img/notepad.png");
        setIconImage(icon.getImage());

        // Set up the window
        setTitle("Notepad");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Set up the menu bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Set up the "Archivo" menu
        archivoMenu = new JMenu("Archivo");
        menuBar.add(archivoMenu);

        nuevaPestañaItem = new JMenuItem("Nueva Pestaña", KeyEvent.VK_N);
        nuevaPestañaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        archivoMenu.add(nuevaPestañaItem);

        nuevaVentanaItem = new JMenuItem("Nueva Ventana", KeyEvent.VK_N);
        nuevaVentanaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        archivoMenu.add(nuevaVentanaItem);

        abrirItem = new JMenuItem("Abrir", KeyEvent.VK_A);
        abrirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        archivoMenu.add(abrirItem);

        guardarItem = new JMenuItem("Guardar", KeyEvent.VK_G);
        guardarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        archivoMenu.add(guardarItem);

        guardarComoItem = new JMenuItem("Guardar Como", KeyEvent.VK_S);
        guardarComoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        archivoMenu.add(guardarComoItem);

        guardarTodoItem = new JMenuItem("Guardar Todo", KeyEvent.VK_S);
        guardarTodoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.ALT_MASK));
        archivoMenu.add(guardarTodoItem);

        configurarPaginaItem = new JMenuItem("Configurar Página");
        archivoMenu.add(configurarPaginaItem);

        imprimirItem = new JMenuItem("Imprimir", KeyEvent.VK_P);
        imprimirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        archivoMenu.add(imprimirItem);

        cerrarPestañaItem = new JMenuItem("Cerrar Pestaña", KeyEvent.VK_W);
        cerrarPestañaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        archivoMenu.add(cerrarPestañaItem);

        guardarVentanaItem = new JMenuItem("Guardar Ventana", KeyEvent.VK_W);
        guardarVentanaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        archivoMenu.add(guardarVentanaItem);

        salirItem = new JMenuItem("Salir");
        archivoMenu.add(salirItem);

        // Set up the "Editor" menu
        editorMenu = new JMenu("Editor");
        menuBar.add(editorMenu);

        nuevaPestañaItem = new JMenuItem("Nueva Pestaña", KeyEvent.VK_N);
        nuevaPestañaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        editorMenu.add(nuevaPestañaItem);

        nuevaVentanaItem = new JMenuItem("Nueva Ventana", KeyEvent.VK_N);
        nuevaVentanaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        editorMenu.add(nuevaVentanaItem);

        abrirItem = new JMenuItem("Abrir", KeyEvent.VK_A);
        abrirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        editorMenu.add(abrirItem);

        guardarItem = new JMenuItem("Guardar", KeyEvent.VK_G);
        guardarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        editorMenu.add(guardarItem);

        guardarComoItem = new JMenuItem("Guardar Como", KeyEvent.VK_S);
        guardarComoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        editorMenu.add(guardarComoItem);

        guardarTodoItem = new JMenuItem("Guardar Todo", KeyEvent.VK_S);
        guardarTodoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.ALT_MASK));
        editorMenu.add(guardarTodoItem);

        configurarPaginaItem = new JMenuItem("Configurar Página");
        editorMenu.add(configurarPaginaItem);

        imprimirItem = new JMenuItem("Imprimir", KeyEvent.VK_P);
        imprimirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        editorMenu.add(imprimirItem);

        cerrarPestañaItem = new JMenuItem("Cerrar Pestaña", KeyEvent.VK_W);
        cerrarPestañaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        editorMenu.add(cerrarPestañaItem);

        guardarVentanaItem = new JMenuItem("Guardar Ventana", KeyEvent.VK_W);
        guardarVentanaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        editorMenu.add(guardarVentanaItem);

        salirItem = new JMenuItem("Salir");
        editorMenu.add(salirItem);

        // Set up the "Ver" menu
        verMenu = new JMenu("Ver");
        menuBar.add(verMenu);

        zoomItem = new JMenuItem("Zoom");
        verMenu.add(zoomItem);

        barraEstadoItem = new JMenuItem("Barra de Estado");
        verMenu.add(barraEstadoItem);

        ajusteLineaItem = new JMenuItem("Ajuste de Línea");
        verMenu.add(ajusteLineaItem);

        // Add action listeners to the menu items
        nuevaPestañaItem.addActionListener(this);
        nuevaVentanaItem.addActionListener(this);
        abrirItem.addActionListener(this);
        guardarItem.addActionListener(this);
        guardarComoItem.addActionListener(this);
        guardarTodoItem.addActionListener(this);
        configurarPaginaItem.addActionListener(this);
        imprimirItem.addActionListener(this);
        cerrarPestañaItem.addActionListener(this);
        guardarVentanaItem.addActionListener(this);
        salirItem.addActionListener(this);
        zoomItem.addActionListener(this);
        barraEstadoItem.addActionListener(this);
        ajusteLineaItem.addActionListener(this);

        // Show the window
        setVisible(true);
    }

     

    public void actionPerformed(ActionEvent e) {
        // Handle menu item actions here
    }

    public static void main(String[] args) {

        try {
            Notepad frame = new Notepad();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}