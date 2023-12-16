package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.35f  reason: invalid class name and case insensitive filesystem */
public class C624835f {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = C130786cX.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C160677o7.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static int A00(Object obj) {
        try {
            return A00.getInt(A01.get(obj));
        } catch (IllegalAccessException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static List A01(AnonymousClass1EU r6) {
        ArrayList A0s = AnonymousClass001.A0s();
        int A002 = A00(r6);
        for (int i = 0; i < A002; i++) {
            C18270x1.A1K(A0s, 0);
        }
        int i2 = r6.bitField0_;
        if ((i2 & 8) != 0) {
            C18270x1.A1K(A0s, 1);
        }
        if ((i2 & 1) != 0) {
            C18270x1.A1K(A0s, 2);
        }
        if ((i2 & 4) != 0) {
            C18270x1.A1K(A0s, 3);
        }
        if ((i2 & 16) != 0) {
            C18270x1.A1K(A0s, 4);
        }
        if ((r6.bitField0_ & 65536) != 0) {
            C18270x1.A1K(A0s, 5);
        }
        int i3 = r6.bitField0_;
        if ((i3 & 32) != 0) {
            C18270x1.A1K(A0s, 6);
        }
        if (AnonymousClass000.A1S(i3 & 64)) {
            C18270x1.A1K(A0s, 7);
        }
        if ((i3 & 128) != 0) {
            C18270x1.A1K(A0s, 8);
        }
        if ((i3 & 256) != 0) {
            C18270x1.A1K(A0s, 9);
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            C18270x1.A1K(A0s, 10);
        }
        if (AnonymousClass000.A1S(r6.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C18270x1.A1K(A0s, 11);
        }
        int i4 = r6.bitField0_;
        if ((i4 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            C18270x1.A1K(A0s, 12);
        }
        if ((i4 & DefaultCrypto.BUFFER_SIZE) != 0) {
            C18270x1.A1K(A0s, 13);
        }
        if ((r6.bitField0_ & 32768) != 0) {
            C18270x1.A1K(A0s, 14);
        }
        if ((r6.bitField0_ & AnonymousClass35S.A0F) != 0) {
            C18270x1.A1K(A0s, 15);
        }
        if (AnonymousClass000.A1S(r6.bitField0_ & 2097152) || (r6.bitField1_ & 134217728) != 0) {
            C18270x1.A1K(A0s, 16);
        }
        int i5 = r6.bitField0_;
        if ((262144 & i5) != 0) {
            C18270x1.A1K(A0s, 17);
        }
        if ((524288 & i5) != 0) {
            C18270x1.A1K(A0s, 18);
        }
        if ((i5 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            C18270x1.A1K(A0s, 19);
        }
        if ((r6.bitField0_ & 134217728) != 0) {
            C18270x1.A1K(A0s, 20);
        }
        int i6 = r6.bitField0_;
        if ((536870912 & i6) != 0) {
            C18270x1.A1K(A0s, 21);
        }
        if ((i6 & 4194304) != 0) {
            C18270x1.A1K(A0s, 22);
        }
        if (r6.A0M()) {
            C18270x1.A1K(A0s, 23);
        }
        int i7 = r6.bitField0_;
        if ((8388608 & i7) != 0) {
            C18270x1.A1K(A0s, 24);
        }
        if (AnonymousClass000.A1S(268435456 & i7)) {
            C18270x1.A1K(A0s, 25);
        }
        if ((i7 & 1073741824) != 0) {
            C18270x1.A1K(A0s, 26);
        }
        if (AnonymousClass000.A1S(r6.bitField0_ & Integer.MIN_VALUE)) {
            C18270x1.A1K(A0s, 27);
        }
        int i8 = r6.bitField1_;
        if ((i8 & 1) != 0) {
            C18270x1.A1K(A0s, 29);
        }
        if ((i8 & 2) != 0) {
            C18270x1.A1K(A0s, 30);
        }
        if ((i8 & 4) != 0) {
            C18270x1.A1K(A0s, 31);
        }
        if (!((i8 & 16) == 0 && (i8 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
            C18270x1.A1K(A0s, 32);
        }
        if ((i8 & 8) != 0) {
            C18270x1.A1K(A0s, 33);
        }
        if ((i8 & 32) != 0) {
            C18270x1.A1K(A0s, 34);
        }
        if (!((i8 & 64) == 0 && (32768 & i8) == 0 && (524288 & i8) == 0)) {
            C18270x1.A1K(A0s, 35);
        }
        if ((i8 & 128) != 0) {
            C21621Cn r0 = r6.pollUpdateMessage_;
            if (r0 == null) {
                r0 = C21621Cn.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                C18270x1.A1K(A0s, 36);
            }
        }
        if ((i8 & 256) != 0) {
            C18270x1.A1K(A0s, 37);
        }
        if ((262144 & i8) != 0) {
            C18270x1.A1K(A0s, 39);
        }
        if ((i8 & 512) != 0) {
            C18270x1.A1K(A0s, 7);
        }
        if ((r6.bitField1_ & DefaultCrypto.BUFFER_SIZE) != 0) {
            C18270x1.A1K(A0s, 11);
        }
        int i9 = r6.bitField1_;
        if ((i9 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            C18270x1.A1K(A0s, 25);
        }
        if ((i9 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            C18270x1.A1K(A0s, 38);
        }
        if ((i9 & 16384) != 0) {
            C18270x1.A1K(A0s, 25);
        }
        if ((i9 & 65536) != 0) {
            C18270x1.A1K(A0s, 40);
        }
        if ((r6.bitField1_ & 1048576) != 0) {
            C18270x1.A1K(A0s, 41);
        }
        int i10 = r6.bitField1_;
        if ((2097152 & i10) != 0) {
            C18270x1.A1K(A0s, 42);
        }
        if ((i10 & AnonymousClass35S.A0F) != 0) {
            C18270x1.A1K(A0s, 43);
        }
        if (AnonymousClass000.A1S(r6.bitField1_ & 4194304)) {
            C18270x1.A1K(A0s, 44);
        }
        int i11 = r6.bitField1_;
        if (!((33554432 & i11) == 0 && (1073741824 & i11) == 0)) {
            C18270x1.A1K(A0s, 45);
        }
        if ((67108864 & i11) != 0) {
            C18270x1.A1K(A0s, 46);
        }
        if ((i11 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            C18270x1.A1K(A0s, 47);
        }
        if ((r6.bitField1_ & 268435456) != 0) {
            C18270x1.A1K(A0s, 48);
        }
        int i12 = r6.bitField1_;
        if ((Integer.MIN_VALUE & i12) != 0) {
            C18270x1.A1K(A0s, 49);
        }
        if ((i12 & 536870912) != 0) {
            C18270x1.A1K(A0s, 50);
        }
        return A0s;
    }

    public static void A02(AnonymousClass36E r3, C624134x r4, C59882xe r5, C55832qz r6) {
        Integer A012 = r5.A01(r4, AnonymousClass29K.A00(r3, r4));
        if (A012 != null) {
            throw new AnonymousClass24A(A012, (String) null);
        } else if (C624134x.A0g(r4)) {
            Log.d("E2eMessageUtils/verifyOutgoingMessageSecret/checking message secret for target message of comment");
            C55162pu A0t = r4.A0t();
            Integer A0Z = C18290x4.A0Z();
            if (A0t != null) {
                Long A03 = r4.A0t().A03();
                if (A03 != null) {
                    C624134x A002 = C55122pp.A00(r6, A03.longValue());
                    if (A002 == null || (A002 instanceof C30441mS)) {
                        throw new AnonymousClass24A(A0Z, (String) null);
                    }
                    A002.A1D = true;
                    Integer A013 = r5.A01(A002, AnonymousClass29K.A00(r3, A002));
                    if (A013 != null) {
                        throw new AnonymousClass24A(A013, (String) null);
                    }
                    return;
                }
                throw new AnonymousClass24A(A0Z, (String) null);
            }
            Log.e("E2eMessageUtils/verifyMessageSecretForComments/comment info for a comment message is null");
            throw new AnonymousClass24A(A0Z, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if ((r4 & 16384) != 0) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C55682qk r8, X.AnonymousClass1VX r9, X.AnonymousClass1EU r10, java.util.List r11) {
        /*
            X.1EU r2 = X.C57312tR.A00(r9, r10)
            r7 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0096
            int r0 = r10.bitField0_
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r6
            boolean r5 = X.AnonymousClass000.A1S(r0)
            if (r5 != 0) goto L_0x005d
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005d
        L_0x001a:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "outer.hasEphemeralMessage="
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = ", inner.hasViewOnceMessage="
            r4.append(r0)
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = X.C18270x1.A1T(r1, r0)
            r4.append(r0)
            java.lang.String r0 = ", inner.hasEphemeralMessage="
            r4.append(r0)
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4.append(r0)
            java.lang.String r0 = ", inner.hasDocumentWithCaptionMessage="
            r4.append(r0)
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.String r1 = X.C18300x5.A0m(r4, r0)
            java.lang.String r0 = "isValidMessage/futureproof/type"
        L_0x0059:
            r8.A0A(r0, r3, r1)
            return r7
        L_0x005d:
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x001a
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x001a
            int r4 = r2.bitField0_
            r0 = r4 & 2
            r2 = 1
            if (r0 != 0) goto L_0x0078
            r2 = 0
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0096
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "hasSenderKeyDistributionMessage="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", hasFastRatchetKeySenderKeyDistributionMessage="
            r1.append(r0)
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.String r1 = X.C18300x5.A0m(r1, r0)
            java.lang.String r0 = "isValidMessage/futureproof/key"
            goto L_0x0059
        L_0x0096:
            int r0 = r11.size()
            if (r0 == r3) goto L_0x00a4
            if (r0 != 0) goto L_0x00a6
            int r0 = r10.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00a6
        L_0x00a4:
            r7 = 1
            return r7
        L_0x00a6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageTypes="
            java.lang.String r1 = X.AnonymousClass000.A0P(r11, r0, r1)
            java.lang.String r0 = "isValidMessage/numtype"
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624835f.A03(X.2qk, X.1VX, X.1EU, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c7, code lost:
        if ((r0.bitField0_ & 2) != 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x025a, code lost:
        if ((r3.bitField1_ & 512) == 0) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0274, code lost:
        if (A00(r0) > 0) goto L_0x020a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.AnonymousClass30C r6, X.C56982ss r7, X.AnonymousClass1VX r8, X.C95814uZ r9, X.AnonymousClass1EU r10) {
        /*
            int r2 = A00(r10)
            r5 = 1
            if (r2 <= 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageUtil/isUnknown/unknown tags="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x0011:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0014:
            return r5
        L_0x0015:
            int r0 = r10.bitField0_
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x0039
            X.1AL r0 = r10.ephemeralMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0027
            X.1AL r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x0027:
            X.1EU r0 = r0.message_
            if (r0 != 0) goto L_0x002d
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x002d:
            int r0 = r0.bitField0_
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x034b
            java.lang.String r0 = "MessageUtil/isUnknown/recursiveEphemeralMessage"
            goto L_0x0011
        L_0x0039:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x004c
            r1 = 854(0x356, float:1.197E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "MessageUtil/isUnknown/interactive message"
            goto L_0x0011
        L_0x004c:
            int r1 = r10.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006e
            X.1EL r0 = r10.listMessage_
            if (r0 != 0) goto L_0x0059
            X.1EL r0 = X.AnonymousClass1EL.DEFAULT_INSTANCE
        L_0x0059:
            X.22j r1 = r0.A0M()
            X.22j r0 = X.AnonymousClass22j.PRODUCT_LIST
            if (r1 != r0) goto L_0x006e
            r1 = 385(0x181, float:5.4E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "MessageUtil/isUnknown/listMessage product list"
            goto L_0x0011
        L_0x006e:
            int r0 = r10.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00c8
            X.1Df r2 = r10.buttonsMessage_
            if (r2 != 0) goto L_0x007a
            X.1Df r2 = X.C21801Df.DEFAULT_INSTANCE
        L_0x007a:
            java.lang.String r0 = "review_and_pay"
            boolean r0 = X.C58952w5.A00(r2, r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "review_order"
            boolean r0 = X.C58952w5.A00(r2, r0)
            if (r0 == 0) goto L_0x009a
        L_0x008c:
            r1 = 833(0x341, float:1.167E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "MessageUtil/isUnknown/JioRechargeNativeFlowMessage"
            goto L_0x0011
        L_0x009a:
            java.lang.String r0 = "payment_method"
            boolean r0 = X.C58952w5.A00(r2, r0)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "payment_status"
            boolean r0 = X.C58952w5.A00(r2, r0)
            if (r0 == 0) goto L_0x00ba
        L_0x00ac:
            r1 = 1595(0x63b, float:2.235E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "MessageUtil/isUnknown/NonNativePaymentMethodOrderUpdateFlowMessage or MessageUtil/isUnknown/NonNativePaymentStatusOrderUpdateFlowMessage"
            goto L_0x0011
        L_0x00ba:
            r1 = 362(0x16a, float:5.07E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "MessageUtil/isUnknown/buttonsMessage"
            goto L_0x0011
        L_0x00c8:
            X.2sP r2 = r6.A01(r10)
            if (r2 == 0) goto L_0x00d8
            boolean r0 = r2.A0B(r8, r10)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowNoviHubMessage"
            goto L_0x0011
        L_0x00d8:
            int r0 = r10.bitField1_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00ec
            r1 = 544(0x220, float:7.62E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "MessageUtil/isUnknown/paymentInviteMessage"
            goto L_0x0011
        L_0x00ec:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x010b
            X.1ER r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x00f8
            X.1ER r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x00f8:
            int r1 = r0.interactiveMessageCase_
            r0 = 4
            if (r1 != r0) goto L_0x010b
            r1 = 832(0x340, float:1.166E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "MessageUtil/isUnknown/shopsStorefrontMessage"
            goto L_0x0011
        L_0x010b:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x012a
            X.1ER r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x0117
            X.1ER r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x0117:
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x012a
            r1 = 1133(0x46d, float:1.588E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowMessage"
            goto L_0x0011
        L_0x012a:
            int r0 = r10.bitField1_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0155
            r0 = 1435(0x59b, float:2.011E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r3, r0)
            if (r0 == 0) goto L_0x013e
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage"
            goto L_0x0011
        L_0x013e:
            X.1Cd r0 = r10.interactiveResponseMessage_
            if (r0 != 0) goto L_0x0144
            X.1Cd r0 = X.C21521Cd.DEFAULT_INSTANCE
        L_0x0144:
            int r1 = r0.interactiveResponseMessageCase_
            r0 = 2
            if (r1 != r0) goto L_0x0155
            r0 = 1436(0x59c, float:2.012E-42)
            boolean r0 = r8.A0Y(r3, r0)
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage/NativeFlowResponse"
            goto L_0x0011
        L_0x0155:
            int r0 = r10.bitField1_
            r0 = r0 & 64
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.String r3 = "MessageUtil/isUnknown/pollCreationMessage"
            if (r0 == 0) goto L_0x016b
            boolean r0 = X.AnonymousClass31e.A01(r8)
            if (r0 != 0) goto L_0x016b
        L_0x0167:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            return r5
        L_0x016b:
            int r1 = r10.bitField1_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x017a
            boolean r0 = X.AnonymousClass31e.A00(r8)
            if (r0 != 0) goto L_0x017a
            goto L_0x0167
        L_0x017a:
            int r1 = r10.bitField1_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x018b
            boolean r0 = X.AnonymousClass31e.A02(r8)
            if (r0 != 0) goto L_0x018b
            java.lang.String r0 = "MessageUtil/isUnknown/pollCreationMessageV3"
            goto L_0x0011
        L_0x018b:
            int r0 = r10.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c9
            X.1Cn r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x0197
            X.1Cn r0 = X.C21621Cn.DEFAULT_INSTANCE
        L_0x0197:
            int r0 = A00(r0)
            if (r0 > 0) goto L_0x0014
            X.1Cn r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x01a3
            X.1Cn r0 = X.C21621Cn.DEFAULT_INSTANCE
        L_0x01a3:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01bd
            boolean r0 = X.AnonymousClass31e.A01(r8)
            if (r0 != 0) goto L_0x01bd
            r1 = 1541(0x605, float:2.16E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = "MessageUtil/isUnknown/pollVoteMessage"
            goto L_0x0011
        L_0x01bd:
            X.1Cn r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x01c3
            X.1Cn r0 = X.C21621Cn.DEFAULT_INSTANCE
        L_0x01c3:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0014
        L_0x01c9:
            int r1 = r10.bitField1_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01db
            r1 = 3139(0xc43, float:4.399E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x01db
            return r5
        L_0x01db:
            int r0 = r10.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01ec
            r1 = 2802(0xaf2, float:3.926E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x01ec
            return r5
        L_0x01ec:
            int r0 = r10.bitField1_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x025c
            r0 = 2189(0x88d, float:3.067E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r4, r0)
            if (r0 == 0) goto L_0x020a
            r0 = 4089(0xff9, float:5.73E-42)
            boolean r0 = r8.A0Y(r4, r0)
            if (r0 != 0) goto L_0x020e
            boolean r0 = r7.A0N(r9)
            if (r0 == 0) goto L_0x020e
        L_0x020a:
            java.lang.String r0 = "MessageUtil/isUnknown/ProtocolMessage has unknown tag"
            goto L_0x0011
        L_0x020e:
            X.1AL r0 = r10.editedMessage_
            if (r0 != 0) goto L_0x0214
            X.1AL r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x0214:
            X.1EU r1 = r0.message_
            if (r1 != 0) goto L_0x021a
            X.1EU r1 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x021a:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x020a
            X.1EM r1 = r1.protocolMessage_
            if (r1 != 0) goto L_0x022a
            X.1EM r1 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x022a:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x020a
            X.1EU r3 = r1.editedMessage_
            if (r3 != 0) goto L_0x0236
            X.1EU r3 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x0236:
            int r1 = r3.bitField0_
            r0 = r1 & 1
            if (r0 != 0) goto L_0x025c
            r0 = r1 & 32
            if (r0 != 0) goto L_0x025c
            r0 = 3686(0xe66, float:5.165E-42)
            boolean r0 = r8.A0Y(r4, r0)
            if (r0 == 0) goto L_0x020a
            int r1 = r3.bitField0_
            r0 = r1 & 4
            if (r0 != 0) goto L_0x025c
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x025c
            r0 = r1 & 64
            if (r0 != 0) goto L_0x025c
            int r0 = r3.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x020a
        L_0x025c:
            X.1EU r1 = X.C57312tR.A01(r8, r10)
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x0277
            X.1EM r0 = r1.protocolMessage_
            if (r0 != 0) goto L_0x0270
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0270:
            int r0 = A00(r0)
            if (r0 <= 0) goto L_0x0277
            goto L_0x020a
        L_0x0277:
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x0289
            if (r2 == 0) goto L_0x0289
            boolean r0 = r2.A0A(r8)
            if (r0 == 0) goto L_0x0289
            java.lang.String r0 = "MessageUtil/isUnknown/templateNativeFlowMessage"
            goto L_0x0011
        L_0x0289:
            int r1 = r10.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x029a
            boolean r0 = X.C627436k.A0I(r8)
            if (r0 != 0) goto L_0x029a
            java.lang.String r0 = "MessageUtil/isUnknown/scheduledCallCreationMessage"
            goto L_0x0011
        L_0x029a:
            int r1 = r10.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x02ab
            boolean r0 = X.C627436k.A0I(r8)
            if (r0 != 0) goto L_0x02ab
            java.lang.String r0 = "MessageUtil/isUnknown/hasScheduledCallEditMessage"
            goto L_0x0011
        L_0x02ab:
            int r1 = r10.bitField1_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x02c0
            r1 = 3355(0xd1b, float:4.701E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = "MessageUtil/isUnknown/ptvMessage"
            goto L_0x0011
        L_0x02c0:
            int r1 = r10.bitField1_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x02d9
            r1 = 4165(0x1045, float:5.836E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = "MessageUtil/isUnknown/botInvokeMessage"
            goto L_0x0011
        L_0x02d9:
            int r1 = r10.bitField1_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x02ee
            r1 = 5141(0x1415, float:7.204E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = "MessageUtil/isUnknown/commentMessage"
            goto L_0x0011
        L_0x02ee:
            int r1 = r10.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = "MessageUtil/isUnknown/BCallMessage"
            goto L_0x0011
        L_0x02f9:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x030c
            r1 = 5192(0x1448, float:7.276E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x030c
            java.lang.String r0 = "MessageUtil/isUnknown/historyBundle"
            goto L_0x0011
        L_0x030c:
            int r1 = r10.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0321
            r1 = 5563(0x15bb, float:7.795E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0321
            java.lang.String r0 = "MessageUtil/isUnknown/EventMessage"
            goto L_0x0011
        L_0x0321:
            int r1 = r10.bitField1_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0336
            r1 = 6535(0x1987, float:9.157E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0336
            java.lang.String r0 = "MessageUtil/isUnknown/NewsletterAdminInvite"
            goto L_0x0011
        L_0x0336:
            int r1 = r10.bitField1_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x035a
            r1 = 5692(0x163c, float:7.976E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 != 0) goto L_0x035a
            java.lang.String r0 = "MessageUtil/isUnknown/lottieMessage"
            goto L_0x0011
        L_0x034b:
            if (r1 != 0) goto L_0x034f
            X.1AL r1 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x034f:
            X.1EU r0 = r1.message_
            if (r0 != 0) goto L_0x0355
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x0355:
            boolean r0 = A04(r6, r7, r8, r9, r0)
            return r0
        L_0x035a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624835f.A04(X.30C, X.2ss, X.1VX, X.4uZ, X.1EU):boolean");
    }
}
