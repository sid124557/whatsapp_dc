package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass9JO;
import X.C86664Kz;

public enum ARRequestAsset$CompressionMethod {
    NONE("NONE"),
    ZIP("ZIP"),
    TAR_BROTLI("TAR_BROTLI");
    
    public String mMethod;

    /* access modifiers changed from: public */
    ARRequestAsset$CompressionMethod(String str) {
        this.mMethod = str;
    }

    public static ARRequestAsset$CompressionMethod fromCompressionType(AnonymousClass9JO r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return NONE;
        }
        if (ordinal == 1) {
            return ZIP;
        }
        if (ordinal == 2) {
            return TAR_BROTLI;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("unsupported compression method for CompressionType : ");
        throw AnonymousClass000.A0F(r2.name(), A0o);
    }

    public static ARRequestAsset$CompressionMethod fromCompressionTypeCppValue(int i) {
        for (AnonymousClass9JO r1 : AnonymousClass9JO.values()) {
            if (r1.mCppValue == i) {
                return fromCompressionType(r1);
            }
        }
        throw AnonymousClass000.A0G("Unsupported compression type : ", AnonymousClass001.A0o(), i);
    }

    public static ARRequestAsset$CompressionMethod fromJson(String str) {
        return valueOf(C86664Kz.A1L(str));
    }

    public static ARRequestAsset$CompressionMethod fromString(String str) {
        return valueOf(C86664Kz.A1L(str));
    }

    public static String toJson(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        return aRRequestAsset$CompressionMethod.getCompressionMethod();
    }

    public static AnonymousClass9JO toXplatCompressionType(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        int ordinal = aRRequestAsset$CompressionMethod.ordinal();
        if (ordinal == 0) {
            return AnonymousClass9JO.None;
        }
        if (ordinal == 1) {
            return AnonymousClass9JO.Zip;
        }
        if (ordinal == 2) {
            return AnonymousClass9JO.TarBrotli;
        }
        throw AnonymousClass000.A0E(aRRequestAsset$CompressionMethod, "Unsupported compression method : ", AnonymousClass001.A0o());
    }

    public String getCompressionMethod() {
        return this.mMethod;
    }
}
