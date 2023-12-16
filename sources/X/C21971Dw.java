package X;

/* renamed from: X.1Dw  reason: invalid class name and case insensitive filesystem */
public final class C21971Dw extends C130786cX implements C181378mf {
    public static final int COLLECTION_NAME_FIELD_NUMBER = 4;
    public static final int CURRENT_LTHASH_FIELD_NUMBER = 1;
    public static final C21971Dw DEFAULT_INSTANCE;
    public static final int FIRST_FOUR_BYTES_FROM_A_HASH_OF_SNAPSHOT_MAC_KEY_FIELD_NUMBER = 5;
    public static final int IS_SENDER_PRIMARY_FIELD_NUMBER = 11;
    public static final int NEW_LTHASH_FIELD_NUMBER = 2;
    public static final int NEW_LTHASH_SUBTRACT_FIELD_NUMBER = 6;
    public static final int NUMBER_ADD_FIELD_NUMBER = 7;
    public static final int NUMBER_OVERRIDE_FIELD_NUMBER = 9;
    public static final int NUMBER_REMOVE_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int PATCH_VERSION_FIELD_NUMBER = 3;
    public static final int SENDER_PLATFORM_FIELD_NUMBER = 10;
    public int bitField0_;
    public C172548Lq collectionName_;
    public C172548Lq currentLthash_;
    public C172548Lq firstFourBytesFromAHashOfSnapshotMacKey_;
    public boolean isSenderPrimary_;
    public C172548Lq newLthashSubtract_;
    public C172548Lq newLthash_;
    public int numberAdd_;
    public int numberOverride_;
    public int numberRemove_;
    public C172548Lq patchVersion_;
    public int senderPlatform_;

    static {
        C21971Dw r1 = new C21971Dw();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21971Dw.class);
    }

    public C21971Dw() {
        C172548Lq r0 = C172548Lq.A01;
        this.currentLthash_ = r0;
        this.newLthash_ = r0;
        this.patchVersion_ = r0;
        this.collectionName_ = r0;
        this.firstFourBytesFromAHashOfSnapshotMacKey_ = r0;
        this.newLthashSubtract_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[13];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "currentLthash_";
                objArr[2] = "newLthash_";
                objArr[3] = "patchVersion_";
                objArr[4] = "collectionName_";
                objArr[5] = "firstFourBytesFromAHashOfSnapshotMacKey_";
                objArr[6] = "newLthashSubtract_";
                objArr[7] = "numberAdd_";
                objArr[8] = "numberRemove_";
                objArr[9] = "numberOverride_";
                objArr[10] = "senderPlatform_";
                objArr[11] = C64033Bv.A00;
                objArr[12] = "isSenderPrimary_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007င\u0006\bင\u0007\tင\b\nဌ\t\u000bဇ\n", objArr);
            case 3:
                return new C21971Dw();
            case 4:
                return new AnonymousClass18F();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21971Dw.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        r0 = C18320x8.A0B(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw C18320x8.A0m();
        }
    }
}
