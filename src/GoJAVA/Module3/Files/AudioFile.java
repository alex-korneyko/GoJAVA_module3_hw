package GoJAVA.Module3.Files;

/**
 * Class {@code AudioFile} inherited from class {@code File}
 * and may contain only audio-data
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class AudioFile extends File {

    /**
     * Method for only audio files
     * @return string "an audio file"
     */
    @Override
    public String GetFileInfo() {

        return super.GetFileInfo() + " an audio file";
    }
}
