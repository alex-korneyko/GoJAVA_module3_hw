package GoJAVA.Module3.Files;

/**
 * Class {@code ImageFile} inherited from class {@code File}
 * and may contain only image-data
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class ImageFile extends File {

    /**
     * Method for only image files
     * @return string "an image file"
     */
    @Override
    public String GetFileInfo() {

        return super.GetFileInfo() + " an image file";
    }
}
