package X;

/* renamed from: X.9K2  reason: invalid class name */
public enum AnonymousClass9K2 {
    EXTRACTION_FAILED("Failed to decompress file"),
    CACHE_PUT_FAILED("Failed to cache asset"),
    CACHE_GET_AFTER_PUT_FAILED("Failed to retrieve cached asset"),
    DOWNLOAD_ERROR(""),
    MODEL_METADATA_DOWNLOAD_FAILURE("Failed to download the model metadata"),
    SCRIPTING_METADATA_DOWNLOAD_FAILURE("Failed to download the script package metadata"),
    MODEL_FETCH_FAILURE(""),
    SCRIPTING_PACKAGE_FETCH_FAILURE("Failed to fetch scripting package"),
    VOLTRON_MODULE_FAILURE("Failed to load voltron module"),
    REQUEST_ASSET_CREATION_FAILURE("Failed to create request asset"),
    METADATA_FETCH_FAILED(""),
    ASSET_DECRYPTION_FAILURE("Failed to decrypt asset"),
    ASSET_ENCODING_FAILURE("Failed to encode asset"),
    OTHER("uncategorized");
    
    public final String mMessage;

    /* access modifiers changed from: public */
    AnonymousClass9K2(String str) {
        this.mMessage = str;
    }
}
