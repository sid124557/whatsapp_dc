package X;

import java.io.InputStream;

/* renamed from: X.6cU  reason: invalid class name and case insensitive filesystem */
public final class C130756cU extends C130786cX implements C181378mf {
    public static final int BACKUP_METADATA_FIELD_NUMBER = 4;
    public static final C130756cU DEFAULT_INSTANCE;
    public static final int HSM_CONTROLLED_KEY_DATA_FIELD_NUMBER = 3;
    public static final int KEY_TYPE_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int WA_PROVIDED_KEY_DATA_FIELD_NUMBER = 2;
    public C130766cV backupMetadata_;
    public int bitField0_;
    public C130716cQ hsmControlledKeyData_;
    public int keyType_;
    public C130726cR waProvidedKeyData_;

    static {
        C130756cU r1 = new C130756cU();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130756cU.class);
    }

    public static C130756cU A00(InputStream inputStream) {
        return (C130756cU) C130786cX.A04(DEFAULT_INSTANCE, inputStream);
    }

    public C130766cV A0M() {
        C130766cV r0 = this.backupMetadata_;
        if (r0 == null) {
            return C130766cV.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public C143046yF A0N() {
        int i = this.keyType_;
        if (i == 0 || i != 1) {
            return C143046yF.WA_PROVIDED;
        }
        return C143046yF.HSM_CONTROLLED;
    }

    public C130716cQ A0O() {
        C130716cQ r0 = this.hsmControlledKeyData_;
        if (r0 == null) {
            return C130716cQ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public C130726cR A0P() {
        C130726cR r0 = this.waProvidedKeyData_;
        if (r0 == null) {
            return C130726cR.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public boolean A0Q() {
        return AnonymousClass000.A1S(this.bitField0_ & 8);
    }

    public boolean A0R() {
        return AnonymousClass000.A1S(this.bitField0_ & 2);
    }
}
