package mvn;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.File;

public class csvToArff {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
   */
  public static void main(final String[] args) throws Exception {
    

    // load CSV
    final CSVLoader loader = new CSVLoader();
    loader.setSource(new File("/home/ana/Documentos/phd/projects/archetypedDB/database/archetyped_database/csv/covid_pe_141704r_14_07_2020.csv"));
    final Instances data = loader.getDataSet();

    // save ARFF
    final ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File("/home/ana/Documentos/phd/projects/archetypedDB/database/archetyped_database/arff/covid_pe_141704r_14_07_2020.arff"));
    //saver.setDestination(new File("/home/ana/Documentos/phd/projects/archetypedDB/database/archetyped_database/arff/"));
    saver.writeBatch();
  }
}