package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3MY  reason: invalid class name */
public final class AnonymousClass3MY implements AnonymousClass4F6 {
    public static final C50912iy A0B = AnonymousClass2BX.A00;
    public final C56612sH A00;
    public final C50672ia A01;
    public final AnonymousClass31V A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final AnonymousClass3MM A05;
    public final C49292gI A06;
    public final C34751vf A07;
    public final C60192y9 A08;
    public final C183538qC A09;
    public final C183538qC A0A;

    public static final boolean A01(AnonymousClass4EJ r2, Integer num, PublicKey publicKey) {
        if (publicKey == null) {
            C18300x5.A1F(r2, "null password key");
            return false;
        } else if (num != null) {
            return true;
        } else {
            C18300x5.A1F(r2, "null password id");
            return false;
        }
    }

    public final void A04(C60272yH r12, AnonymousClass4EJ r13, C54662p5 r14, AnonymousClass24F r15, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        AnonymousClass0x9.A0c(this.A0A).A05(Boolean.TRUE);
        AnonymousClass36K A0l = r15.node.A0l("error");
        AnonymousClass4EJ r6 = r13;
        if (!(A0l == null || r12 == null)) {
            Boolean valueOf = Boolean.valueOf(A0l.A0r("ndc", (String) null));
            Boolean valueOf2 = Boolean.valueOf(A0l.A0r("npr", (String) null));
            C162457s7.A0H(valueOf);
            if (!valueOf.booleanValue()) {
                C162457s7.A0H(valueOf2);
                if (!valueOf2.booleanValue()) {
                    AnonymousClass2MV r2 = new AnonymousClass2MV(1, r12);
                    Integer valueOf3 = Integer.valueOf(i);
                    X509Certificate x509Certificate2 = x509Certificate;
                    C162457s7.A0J(x509Certificate2, 1);
                    C162457s7.A0J(r13, 4);
                    C162457s7.A0J(r14, 5);
                    C626936e.A06(r2);
                    C162457s7.A0H(r2);
                    Object obj = r2.A01;
                    C626936e.A06(obj);
                    C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.fbusers.FBUserEntity");
                    PublicKey publicKey2 = publicKey;
                    A05((C60272yH) obj, r6, r14, publicKey2, x509Certificate2, AnonymousClass0x7.A04(valueOf3, publicKey2));
                    return;
                }
            }
        }
        r13.BSB(r15);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass4EJ r22, X.C54662p5 r23, java.lang.Integer r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.security.PublicKey r28, java.security.cert.X509Certificate r29, int r30) {
        /*
            r21 = this;
            r0 = 0
            r6 = r23
            r11 = r29
            X.C18270x1.A11(r11, r0, r6)
            r5 = r22
            r8 = r24
            r10 = r28
            boolean r0 = A01(r5, r8, r10)
            if (r0 == 0) goto L_0x0068
            java.security.KeyPair r2 = X.AnonymousClass341.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass341.A01(r2)
            java.lang.String r9 = X.AnonymousClass341.A00()
            X.C162457s7.A0D(r9)
            int r0 = X.AnonymousClass0x7.A04(r8, r10)     // Catch:{ NoSuchAlgorithmException -> 0x0063 }
            r7 = r21
            java.lang.String r0 = r7.A02(r9, r10, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0063 }
            org.json.JSONObject r0 = r7.A03(r1, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.C162457s7.A0H(r0)     // Catch:{  }
            X.2Q4 r14 = X.C50672ia.A00(r7, r0, r11)     // Catch:{  }
            r15 = 0
            X.1vd r13 = new X.1vd     // Catch:{  }
            r16 = r25
            r17 = r26
            r18 = r27
            r20 = r30
            r19 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.1vf r3 = r7.A07
            java.security.PrivateKey r2 = r2.getPrivate()
            r12 = 0
            X.4JC r4 = new X.4JC
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 37
            X.3MK r0 = new X.3MK
            r0.<init>(r5, r4, r7, r2)
            r3.A01(r0, r13, r1)
            return
        L_0x0063:
            r0 = move-exception
            r5.BSB(r0)
            return
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.A07(X.4EJ, X.2p5, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public void Bgp(C60272yH r14, AnonymousClass4EJ r15, C54662p5 r16, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        C54662p5 r6 = r16;
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass0x2.A1A(x509Certificate2, 0, r6);
        AnonymousClass3MM r3 = this.A05;
        AnonymousClass3MK r2 = new AnonymousClass3MK(r15, new AnonymousClass4JC(r15, r6, this, num, str, publicKey, x509Certificate2, 1), this, (PrivateKey) null);
        AnonymousClass31C r5 = r3.A01;
        String A032 = r5.A03();
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0B(A012, "smax_id", 59);
        C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
        C56052rL.A0D(A012, "xmlns", "waffle");
        C56052rL.A0E(A012, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C56052rL.A05(r3.A00, C56052rL.A04("timestamp"), A012);
        r5.A0K(new AnonymousClass4KQ(r2, 11), A012.A0F(), A032, 264, 32000);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A00(X.AnonymousClass4EJ r20, X.C54662p5 r21, X.C166557yt r22, X.AnonymousClass3MY r23, java.lang.String r24, java.security.PublicKey r25, java.security.cert.X509Certificate r26, int r27) {
        /*
            r5 = r20
            java.security.KeyPair r2 = X.AnonymousClass341.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass341.A01(r2)
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r27
            java.lang.String r0 = r8.A02(r9, r10, r12)     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r7 = r22
            byte[] r19 = r8.A0A(r7)
            org.json.JSONObject r0 = r8.A03(r1, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.C162457s7.A0H(r0)     // Catch:{  }
            r11 = r26
            X.2Q4 r14 = X.C50672ia.A00(r8, r0, r11)     // Catch:{  }
            r16 = 0
            r20 = -1
            X.1vd r13 = new X.1vd     // Catch:{  }
            r18 = r16
            r15 = r7
            r17 = r16
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.1vf r3 = r8.A07
            java.security.PrivateKey r2 = r2.getPrivate()
            X.3Xk r4 = new X.3Xk
            r6 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 38
            X.3MK r0 = new X.3MK
            r0.<init>(r5, r4, r8, r2)
            r3.A01(r0, r13, r1)
            return
        L_0x0053:
            r0 = move-exception
            r5.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.A00(X.4EJ, X.2p5, X.7yt, X.3MY, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public final String A02(String str, PublicKey publicKey, int i) {
        String A042 = this.A01.A04(Integer.valueOf(i), str, (String) null, publicKey);
        C162457s7.A0D(A042);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("#PWD_WA:11:");
        A0o.append(C56612sH.A02(this.A00));
        return AnonymousClass0x2.A0e(A042, A0o, ':');
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C60272yH r20, X.AnonymousClass4EJ r21, X.C54662p5 r22, java.security.PublicKey r23, java.security.cert.X509Certificate r24, int r25) {
        /*
            r19 = this;
            r1 = r25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6 = r21
            r7 = r23
            boolean r0 = A01(r6, r0, r7)
            if (r0 == 0) goto L_0x006e
            java.security.KeyPair r3 = X.AnonymousClass341.A03()     // Catch:{  }
            java.lang.String r2 = X.AnonymousClass341.A01(r3)
            r8 = r20
            X.7yt r0 = r8.A05     // Catch:{ NoSuchAlgorithmException -> 0x0069 }
            java.lang.String r0 = X.C18280x3.A0b(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0069 }
            r5 = r19
            java.lang.String r0 = r5.A02(r0, r7, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0069 }
            org.json.JSONObject r0 = r5.A03(r2, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.C162457s7.A0H(r0)     // Catch:{  }
            r9 = r24
            X.2Q4 r11 = X.C50672ia.A00(r5, r0, r9)     // Catch:{  }
            X.7yt r12 = r8.A04     // Catch:{  }
            byte[] r16 = r5.A0A(r12)     // Catch:{  }
            r13 = 0
            r17 = -1
            X.1vd r10 = new X.1vd     // Catch:{  }
            r15 = r13
            r14 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{  }
            X.1vf r4 = r5.A07
            java.security.PrivateKey r3 = r3.getPrivate()
            X.3Xi r2 = new X.3Xi
            r14 = r22
            r16 = r7
            r17 = r9
            r18 = r1
            r13 = r6
            r15 = r5
            r11 = r2
            r12 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1 = 63
            X.3MK r0 = new X.3MK
            r0.<init>(r6, r2, r5, r3)
            r4.A01(r0, r10, r1)
            return
        L_0x0069:
            r0 = move-exception
            r6.BSB(r0)
            return
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.A05(X.2yH, X.4EJ, X.2p5, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass4EJ r29, X.C54662p5 r30, X.C166557yt r31, X.C166557yt r32, X.C166557yt r33, X.C166557yt r34, X.C166557yt r35, java.lang.Integer r36, java.security.PublicKey r37, java.security.cert.X509Certificate r38, int r39) {
        /*
            r28 = this;
            java.lang.String r5 = "account_type"
            r9 = r39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r11 = r29
            r4 = r37
            boolean r0 = A01(r11, r0, r4)
            if (r0 == 0) goto L_0x00de
            java.security.KeyPair r10 = X.AnonymousClass341.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass341.A01(r10)
            java.lang.String r3 = X.AnonymousClass341.A00()
            X.C162457s7.A0D(r3)
            r2 = r28
            java.lang.String r0 = r2.A02(r3, r4, r9)     // Catch:{ NoSuchAlgorithmException -> 0x00d9 }
            org.json.JSONObject r6 = r2.A03(r1, r0)     // Catch:{  }
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{  }
            r19 = r36
            if (r36 == 0) goto L_0x003d
            int r0 = r19.intValue()     // Catch:{  }
            r6.put(r5, r0)     // Catch:{  }
            r8.put(r5, r0)     // Catch:{  }
        L_0x003d:
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r34
            r17 = r35
            if (r31 == 0) goto L_0x004c
            if (r32 == 0) goto L_0x004c
            goto L_0x007c
        L_0x004c:
            java.lang.String r7 = "reset_password_auth_blob"
            if (r33 == 0) goto L_0x005f
            java.lang.String r1 = "native_auth_blob"
            java.lang.Object r0 = X.C18330xA.A08(r15)     // Catch:{  }
            r8.put(r1, r0)     // Catch:{  }
            X.C18300x5.A1L(r8, r7, r6)     // Catch:{  }
            goto L_0x0097
        L_0x005f:
            if (r34 == 0) goto L_0x0097
            if (r35 == 0) goto L_0x0097
            java.lang.String r1 = "web_auth_token"
            java.lang.Object r0 = X.C18330xA.A08(r16)     // Catch:{  }
            org.json.JSONObject r5 = r8.put(r1, r0)     // Catch:{  }
            java.lang.String r1 = "web_auth_uri"
            java.lang.Object r0 = X.C18330xA.A08(r17)     // Catch:{  }
            r5.put(r1, r0)     // Catch:{  }
            X.C18300x5.A1L(r8, r7, r6)     // Catch:{  }
            goto L_0x0097
        L_0x007c:
            java.lang.String r5 = "fbid"
            java.lang.Object r0 = X.C18330xA.A08(r13)     // Catch:{  }
            X.C162457s7.A0D(r0)     // Catch:{  }
            long r0 = X.C18310x6.A0B(r0)     // Catch:{  }
            org.json.JSONObject r5 = r6.put(r5, r0)     // Catch:{  }
            java.lang.String r1 = "native_auth_nonce"
            java.lang.Object r0 = X.C18330xA.A08(r14)     // Catch:{  }
            r5.put(r1, r0)     // Catch:{  }
        L_0x0097:
            java.lang.String r0 = r6.toString()     // Catch:{  }
            X.C162457s7.A0H(r0)     // Catch:{  }
            r1 = r38
            X.2Q4 r21 = X.C50672ia.A00(r2, r0, r1)     // Catch:{  }
            r22 = 0
            r27 = -1
            X.1vd r0 = new X.1vd     // Catch:{  }
            r24 = r22
            r25 = r22
            r26 = r22
            r20 = r0
            r23 = r22
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{  }
            X.1vf r6 = r2.A07
            java.security.PrivateKey r5 = r10.getPrivate()
            X.3Xl r10 = new X.3Xl
            r12 = r30
            r20 = r3
            r21 = r4
            r22 = r1
            r23 = r9
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 64
            X.3MK r1 = new X.3MK
            r1.<init>(r11, r10, r2, r5)
            r6.A01(r1, r0, r3)
            return
        L_0x00d9:
            r0 = move-exception
            r11.BSB(r0)
            return
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.A06(X.4EJ, X.2p5, X.7yt, X.7yt, X.7yt, X.7yt, X.7yt, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public final boolean A09(AnonymousClass4EJ r5, C54662p5 r6, AnonymousClass24F r7, Runnable runnable, int i) {
        if (!(i == 400 || i == 405)) {
            if (!(i == 408 || i == 429)) {
                if (i == 481) {
                    C162457s7.A0J(r6, 0);
                    if (r6.A04()) {
                        runnable.run();
                        return true;
                    }
                } else if (i != 500) {
                    if (i != 503) {
                        return false;
                    }
                }
            }
            C60192y9 r1 = this.A08;
            C162457s7.A0J(r6, 0);
            Long A012 = r6.A01();
            if (A012 != null) {
                r1.A00.Bkn(runnable, "WaffleIQErrorHelper/retry", A012.longValue());
                return true;
            }
        }
        r5.BSB(r7);
        return true;
    }

    public final byte[] A0A(C166557yt r5) {
        AnonymousClass2KK A042 = ((C621133n) this.A09.get()).A00.A04();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("1539");
        return AnonymousClass36G.A09(A042.A00, AnonymousClass0x2.A1a(AnonymousClass001.A0k(A0o, C18310x6.A0B(C18330xA.A08(r5)))));
    }

    public /* bridge */ /* synthetic */ void Bgn(AnonymousClass4EJ r22, C54662p5 r23, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        AnonymousClass2MV r2 = (AnonymousClass2MV) obj;
        X509Certificate x509Certificate2 = x509Certificate;
        C162457s7.A0J(x509Certificate2, 1);
        C54662p5 r11 = r23;
        C162457s7.A0J(r11, 5);
        C626936e.A06(r2);
        C162457s7.A0H(r2);
        AnonymousClass4EJ r10 = r22;
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        if (r2.A00 != 1) {
            Object obj2 = r2.A01;
            C626936e.A06(obj2);
            C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj2;
            Integer num3 = (Integer) list.get(1);
            PublicKey publicKey3 = publicKey2;
            C166557yt r16 = (C166557yt) list.get(5);
            A06(r10, r11, (C166557yt) C18290x4.A0k(list), (C166557yt) list.get(2), (C166557yt) list.get(3), (C166557yt) list.get(4), r16, num3, publicKey3, x509Certificate2, AnonymousClass0x7.A04(num2, publicKey2));
            return;
        }
        Object obj3 = r2.A01;
        C626936e.A06(obj3);
        C162457s7.A0K(obj3, "null cannot be cast to non-null type com.whatsapp.fbusers.FBUserEntity");
        A05((C60272yH) obj3, r10, r11, publicKey2, x509Certificate2, AnonymousClass0x7.A04(num2, publicKey2));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgq(X.C60272yH r24, X.AnonymousClass4EJ r25, X.C54662p5 r26, java.lang.Integer r27, java.security.PublicKey r28, java.security.cert.X509Certificate r29) {
        /*
            r23 = this;
            r7 = r24
            r3 = r29
            X.C18260x0.A0O(r3, r7)
            r0 = 5
            r8 = r26
            X.C162457s7.A0J(r8, r0)
            r6 = r25
            r5 = r27
            r4 = r28
            boolean r0 = A01(r6, r5, r4)
            if (r0 == 0) goto L_0x008d
            X.7yt r0 = r7.A02     // Catch:{ JSONException -> 0x0088 }
            java.lang.Object r12 = X.C18330xA.A08(r0)     // Catch:{ JSONException -> 0x0088 }
            X.C162457s7.A0D(r12)     // Catch:{ JSONException -> 0x0088 }
            org.json.JSONObject r11 = X.AnonymousClass0x7.A11()     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r10 = "timestamp"
            r2 = r23
            X.2sH r9 = r2.A00     // Catch:{ JSONException -> 0x0088 }
            long r0 = X.C56612sH.A02(r9)     // Catch:{ JSONException -> 0x0088 }
            r11.put(r10, r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "access_token"
            java.lang.String r1 = X.AnonymousClass0x9.A0y(r12, r0, r11)     // Catch:{ JSONException -> 0x0088 }
            X.C162457s7.A0H(r1)     // Catch:{ JSONException -> 0x0088 }
            X.2ia r0 = r2.A01     // Catch:{  }
            X.2Q4 r13 = r0.A02(r1, r3)     // Catch:{  }
            r9.A0H()     // Catch:{  }
            X.7yt r14 = r7.A04     // Catch:{  }
            r15 = 0
            r19 = -1
            X.1vd r12 = new X.1vd     // Catch:{  }
            r17 = r15
            r18 = r15
            r16 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{  }
            X.31C r9 = r2.A04
            java.lang.String r1 = r9.A03()
            r20 = 264(0x108, float:3.7E-43)
            X.1vf r11 = r2.A07
            r10 = 83
            r0 = 1
            X.2rL r0 = X.C387629c.A00(r1, r10, r0)
            r11.A02(r0, r12)
            X.36K r18 = r0.A0F()
            X.3T9 r10 = new X.3T9
            r16 = r4
            r17 = r3
            r12 = r6
            r13 = r8
            r14 = r2
            r15 = r5
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r21 = 32000(0x7d00, double:1.581E-319)
            r16 = r9
            r17 = r10
            r19 = r1
            r16.A0K(r17, r18, r19, r20, r21)
            return
        L_0x0088:
            r0 = move-exception
            r6.BSB(r0)
            return
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.Bgq(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgr(X.C60272yH r21, X.AnonymousClass4EJ r22, X.C54662p5 r23, java.lang.Integer r24, java.security.PublicKey r25, java.security.cert.X509Certificate r26) {
        /*
            r20 = this;
            r9 = r21
            r1 = r26
            X.C18260x0.A0O(r1, r9)
            r0 = 4
            r6 = r22
            r8 = r23
            X.AnonymousClass0x2.A1A(r6, r0, r8)
            r7 = r24
            r5 = r25
            boolean r0 = A01(r6, r7, r5)
            if (r0 == 0) goto L_0x0075
            java.security.KeyPair r10 = X.AnonymousClass341.A03()     // Catch:{  }
            java.lang.String r3 = X.AnonymousClass341.A01(r10)
            X.7yt r0 = r9.A05     // Catch:{ NoSuchAlgorithmException -> 0x0070 }
            java.lang.String r2 = X.C18280x3.A0b(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0070 }
            int r0 = X.AnonymousClass0x7.A04(r7, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0070 }
            r4 = r20
            java.lang.String r0 = r4.A02(r2, r5, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0070 }
            org.json.JSONObject r0 = r4.A03(r3, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.C162457s7.A0H(r0)     // Catch:{  }
            X.2Q4 r12 = X.C50672ia.A00(r4, r0, r1)     // Catch:{  }
            X.7yt r13 = r9.A04     // Catch:{  }
            r14 = 0
            r18 = -1
            X.1vd r11 = new X.1vd     // Catch:{  }
            r16 = r14
            r17 = r14
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{  }
            X.1vf r3 = r4.A07
            java.security.PrivateKey r2 = r10.getPrivate()
            X.3Xj r12 = new X.3Xj
            r16 = r4
            r17 = r7
            r18 = r5
            r19 = r1
            r13 = r9
            r14 = r6
            r15 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = 46
            X.3MK r0 = new X.3MK
            r0.<init>(r6, r12, r4, r2)
            r3.A01(r0, r11, r1)
            return
        L_0x0070:
            r0 = move-exception
            r6.BSB(r0)
            return
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MY.Bgr(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public AnonymousClass3MY(C56612sH r2, C50672ia r3, AnonymousClass31V r4, AnonymousClass1VX r5, AnonymousClass31C r6, AnonymousClass3MM r7, C49292gI r8, C34751vf r9, C60192y9 r10, C183538qC r11, C183538qC r12) {
        C18260x0.A0f(r2, r5, r6, r3, r10);
        AnonymousClass0x2.A1B(r11, r12);
        C162457s7.A0J(r8, 11);
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A08 = r10;
        this.A02 = r4;
        this.A0A = r11;
        this.A09 = r12;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
    }

    public final JSONObject A03(String str, String str2) {
        JSONObject A11 = AnonymousClass0x7.A11();
        A11.put("timestamp", C56612sH.A02(this.A00));
        A11.put("password", str2);
        C18310x6.A1K(str, A11);
        return A11;
    }

    public final boolean A08(AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass24F r5, Runnable runnable, int i) {
        if (!A09(r3, r4, r5, runnable, i)) {
            if (i == 483) {
                ((C48782fT) this.A08.A04.get()).A00();
                r3.BSB(r5);
            } else if (i != 485) {
                return false;
            } else {
                this.A08.A00(r3, r5);
                return true;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void Bgm(AnonymousClass4EJ r11, C54662p5 r12, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A07(r11, r12, num, str, str2, str3, publicKey, x509Certificate, num2.intValue());
    }
}
