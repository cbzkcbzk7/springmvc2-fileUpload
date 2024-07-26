package hello.upload.domain;

import lombok.Data;

/**
 * packageName    : hello.upload.domain
 * fileName       : UploadFile
 * author         : Sora
 * date           : 2024-07-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-26        Sora       최초 생성
 */
@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;   // 저장되는 파일명 : 다른 사용자가 같은 파일명을 업로드했을 때 구분하기 위해 사용

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
