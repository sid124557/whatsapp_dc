package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public final class C53482nA {
    public final C56972sr A00;
    public final C47992eA A01;
    public final C56662sM A02;
    public final C49092fy A03;
    public final C55832qz A04;
    public final JniBridge A05;

    public final C52042kn A00(C95814uZ r5, AnonymousClass1ET r6, AnonymousClass2z0 r7) {
        if (r6 != null) {
            C56972sr r1 = this.A00;
            if (r7.A02 || r5 == null) {
                r5 = null;
            }
            return C33051sM.A00(r1, r5, r6, r7, false);
        }
        throw AnonymousClass24W.A00(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r5 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3Z1 A01(X.C53192mh r9) {
        /*
            r8 = this;
            r1 = 0
            X.2z0 r5 = r9.A01
            if (r5 == 0) goto L_0x00d8
            X.2fy r2 = r8.A03
            X.2z0 r1 = r2.A00(r5)
            X.2qz r0 = r8.A04
            X.34x r3 = r0.A05(r1)
            if (r3 == 0) goto L_0x00cc
            X.2eA r4 = r8.A01
            long r0 = r3.A1L
            byte[] r4 = r4.A01(r0)
            boolean r1 = r9.A03
            boolean r0 = r5.A02
            com.whatsapp.jid.UserJid r5 = r3.A0o()
            if (r1 == 0) goto L_0x00bb
            if (r0 == 0) goto L_0x0095
            X.2sr r0 = r8.A00
            X.1fH r5 = r0.A0I()
        L_0x002d:
            X.2z0 r0 = r3.A1J
            X.C162457s7.A0C(r0)
            X.2z0 r3 = r2.A01(r0)
            com.whatsapp.jid.UserJid r6 = r9.A00
            byte[] r7 = r9.A04
            X.45i r2 = new X.45i
            r2.<init>(r9, r8)
            if (r4 == 0) goto L_0x0085
            int r1 = r4.length
            r0 = 32
            if (r1 != r0) goto L_0x0085
            r1 = 0
            if (r3 != 0) goto L_0x005c
            java.lang.String r0 = "MessageSecretEncryptionCommons/encryptionParamValidation/parent key is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.24A r0 = X.AnonymousClass24A.A00(r1)
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x0056:
            X.C57682u2.A01(r0)
            X.3Z1 r0 = (X.AnonymousClass3Z1) r0
            return r0
        L_0x005c:
            if (r5 != 0) goto L_0x006c
            java.lang.String r0 = "MessageSecretEncryptionCommons/encryptionParamValidation/targetSenderUserJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.24A r0 = X.AnonymousClass24A.A00(r1)
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x0056
        L_0x006c:
            if (r6 != 0) goto L_0x007c
            java.lang.String r0 = "MessageSecretEncryptionCommons/encryptionParamValidation/senderUserJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.24A r0 = X.AnonymousClass24A.A00(r1)
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x0056
        L_0x007c:
            java.lang.Object r0 = r2.BGl(r3, r4, r5, r6, r7)
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0
            java.lang.Object r0 = r0.value
            goto L_0x0056
        L_0x0085:
            java.lang.String r0 = "MessageSecretEncryptionCommons/encryptionParamValidation/message secret missing or invalid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 66
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x0056
        L_0x0095:
            boolean r0 = X.C627336j.A0L(r5)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C162457s7.A0K(r5, r0)
            goto L_0x002d
        L_0x00a2:
            boolean r0 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "MessageSecretEncryptionCommons/getSenderUserJid/found phone number jid when lid is expected"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2sM r1 = r8.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C162457s7.A0K(r5, r0)
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            X.1fH r5 = r1.A01(r5)
            goto L_0x002d
        L_0x00bb:
            if (r0 == 0) goto L_0x00c5
            X.2sr r0 = r8.A00
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A05(r0)
            goto L_0x002d
        L_0x00c5:
            if (r5 == 0) goto L_0x00c9
            goto L_0x002d
        L_0x00c9:
            r5 = 0
            goto L_0x002d
        L_0x00cc:
            java.lang.String r0 = "MessageSecretEncryptionCommons/encrypt/target message not found. Cannot proceed further"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 71
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00d8:
            java.lang.String r0 = "MessageSecretEncryptionCommons/encrypt/target message key is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.24A r0 = X.AnonymousClass24A.A00(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53482nA.A01(X.2mh):X.3Z1");
    }

    public final byte[] A02(C53672nT r19) {
        UserJid A0o;
        Object A012;
        AnonymousClass4AI r0;
        C53672nT r8 = r19;
        AnonymousClass2z0 r2 = r8.A05;
        AnonymousClass2z0 r4 = A00(r8.A02, r8.A04, r2).A01;
        if (r4 != null) {
            C624134x A052 = this.A04.A05(this.A03.A00(r4));
            if (A052 == null) {
                Log.i("MessageSecretEncryptionCommons/decrypt/target message was not found. Cannot decrypt the message. Save message as orphan if needed");
                return null;
            }
            byte[] A013 = this.A01.A01(A052.A1L);
            if (A052.A1J.A02) {
                A0o = C56972sr.A05(this.A00);
            } else {
                A0o = A052.A0o();
            }
            C172548Lq r7 = r8.A00;
            C172548Lq r6 = r8.A01;
            UserJid userJid = r8.A03;
            C76733sG r3 = new C76733sG(r8, this);
            if (A013 == null || A013.length != 32) {
                Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/message secret missing or invalid");
                A012 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(66));
            } else if (r7 == null || r7.A03() != 12) {
                Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/encIv missing or invalid");
                A012 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(11));
            } else if (r6 == null || r6.A03() == 0) {
                Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/encPayload missing or invalid");
                A012 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(11));
            } else if (A0o == null) {
                Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/targetSenderUserJid is null");
                A012 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(0));
            } else if (userJid == null) {
                Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/senderUserJid is null");
                A012 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(0));
            } else {
                byte[] A07 = r7.A07();
                byte[] A072 = r6.A07();
                UserJid userJid2 = A0o;
                C162457s7.A0J(userJid2, 4);
                if (C162457s7.A0P(r3.$params.A06, "Poll Vote")) {
                    r0 = new AnonymousClass3OT(userJid, r4);
                } else {
                    r0 = new AnonymousClass3OS();
                }
                byte[] B40 = r0.B40();
                JniBridge jniBridge = r3.this$0.A05;
                String str = r4.A01;
                C162457s7.A0C(str);
                byte[] bArr = A013;
                Object A014 = C57512tl.A01(userJid2, userJid, jniBridge, str, r3.$params.A06, A07, A072, B40, bArr);
                if (A014 == null) {
                    UserJid A032 = r3.this$0.A02.A03(userJid2);
                    if (A032 != null) {
                        A014 = C57512tl.A01(A032, userJid, r3.this$0.A05, str, r3.$params.A06, A07, A072, (byte[]) null, bArr);
                        if (A014 == null) {
                            A014 = AnonymousClass3Z0.A01(new AnonymousClass24W(51));
                        }
                    } else {
                        throw new AnonymousClass24W(51);
                    }
                }
                A012 = new AnonymousClass3Z9(A014).value;
            }
            C57682u2.A01(A012);
            return (byte[]) A012;
        }
        Log.e("MessageSecretEncryptionCommons/getMessage/cannot find message for given key");
        throw AnonymousClass24W.A00(0);
    }

    public C53482nA(C56972sr r2, C47992eA r3, C56662sM r4, C49092fy r5, C55832qz r6, JniBridge jniBridge) {
        C18260x0.A0c(r2, jniBridge, r4, r6);
        C162457s7.A0J(r3, 6);
        this.A00 = r2;
        this.A05 = jniBridge;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
    }
}
