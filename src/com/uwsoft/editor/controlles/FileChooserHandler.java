package com.uwsoft.editor.controlles;

import javax.swing.JFileChooser;

public interface FileChooserHandler {

    public boolean isMultiple();

    public String getDefaultPath();

    public int getFileSelectionMode();

    public void FileChoosen(JFileChooser jfc);

}
