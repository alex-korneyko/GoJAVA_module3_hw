package GoJAVA.Module3.Files;

/**
 * Class {@code TextFile} inherited from class {@code File}
 * and may contain only text-data
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class TextFile extends File {

    /**
     * Method for only text files
     * @return string "a text file"
     */
    @Override
    public String GetFileInfo() {

        return super.GetFileInfo() + " a text file";
    }
}
