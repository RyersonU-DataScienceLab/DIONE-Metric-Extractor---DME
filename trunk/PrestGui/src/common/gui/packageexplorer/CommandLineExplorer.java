package common.gui.packageexplorer;

import java.io.File;

import javax.swing.JOptionPane;

import common.monitor.Logger;

import predictor.WekaRunner;
import prestgui.PrestGuiView;
import definitions.application.ApplicationProperties;
import executor.ParserExecutor;
import common.CsvToArff;
import common.gui.packageexplorer.PackageExplorer;

public class CommandLineExplorer {
	PackageExplorer packageExplorer;

	public void listCommandLineOptions() {
		System.out.println("The command line options are:");
		System.out.println("-addProject projectDirectory");
		System.out.println("-parse projectDirectory");
	}

	public void startExecFromCmdLine(String[] args) {
		packageExplorer = new PackageExplorer();
		//packageExplorer.traverseRepository();
		//console run format change
		if (args[0].equalsIgnoreCase("-addProject")) {
			packageExplorer.addNewProjectCmd(args[1]);
		}
		else if (args[0].equalsIgnoreCase("-parse")) {
			// args[2] is the freeze label
			packageExplorer.parseManualCmd(args[1], args[2]);
		}
		else if (args[0].equalsIgnoreCase("-convertToArff")) {
			// args[2] is the freeze label
			packageExplorer.parseManualCmd(args[1], args[2]);
		}
		else if (args[0].equalsIgnoreCase("-predict")) {
			// args[2] is the freeze label
			packageExplorer.parseManualCmd(args[1], args[2]);
		} 
		else {
			listCommandLineOptions();
		}
		
		 
		
	}/*
	public void startExecFromCmdLine(String[] args) {
		packageExplorer = new PackageExplorer();
		//packageExplorer.traverseRepository();
		//console run format change
		if (args[0].equalsIgnoreCase("-addProject")) {
			packageExplorer.addNewProjectCmd(args[1]);
		} else {
			listCommandLineOptions();
		}
		
		if (args[2].equalsIgnoreCase("-parse")) {
			packageExplorer.parseManualCmd(args[3]);
		}  
		
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
