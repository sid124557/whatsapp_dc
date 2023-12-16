package X;

/* renamed from: X.1P3  reason: invalid class name */
public abstract class AnonymousClass1P3 extends C56822sc {
    public final C44322Vp A00;

    public C373121t A0D() {
        if (this instanceof AnonymousClass1P2) {
            return ((AnonymousClass1P2) this).A03;
        }
        if (this instanceof AnonymousClass1P1) {
            return ((AnonymousClass1P1) this).A01;
        }
        if (this instanceof AnonymousClass1P0) {
            return ((AnonymousClass1P0) this).A02;
        }
        if (this instanceof C22641Oz) {
            return ((C22641Oz) this).A02;
        }
        return ((C22631Oy) this).A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0E() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass1P2
            if (r0 == 0) goto L_0x0090
            r4 = r7
            X.1P2 r4 = (X.AnonymousClass1P2) r4
            X.2XZ r0 = r4.A00
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            X.3dV r0 = r0.A01
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0089 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "SELECT chat_row_id FROM bot_chat_info WHERE welcome_request_message_sent = 1"
            java.lang.String r0 = "BotChatInfoStore/GET_ALL_CHATS_HAVE_SENT_WELCOME_REQUEST_MESSAGE"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "chat_row_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0082 }
        L_0x0026:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0030
            X.C18260x0.A0H(r2, r6, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0026
        L_0x0030:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "BotChatInfoStore/getAllChatRowIdsHaveSentWelcomeRequestMessage size="
            X.C18260x0.A1A(r0, r1, r6)     // Catch:{ all -> 0x0082 }
            r2.close()     // Catch:{ all -> 0x0089 }
            r3.close()
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.Iterator r3 = r6.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005d
            long r1 = X.C18270x1.A02(r3)
            X.2sm r0 = r4.A02
            X.4uZ r0 = r0.A0B(r1)
            if (r0 == 0) goto L_0x0047
            r5.add(r0)
            goto L_0x0047
        L_0x005d:
            r5.size()
            java.util.ArrayList r4 = X.C73783g4.A0c(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x0068:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0081
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x7.A0S(r3)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r1 = r0.getRawString()
            X.2jq r0 = new X.2jq
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0068
        L_0x0081:
            return r4
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x0090:
            boolean r0 = r7 instanceof X.AnonymousClass1P1
            if (r0 == 0) goto L_0x00c5
            r0 = r7
            X.1P1 r0 = (X.AnonymousClass1P1) r0
            X.8qC r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.2ml r0 = (X.C53232ml) r0
            java.util.Set r0 = r0.A00()
            if (r0 == 0) goto L_0x00c2
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.2jq r0 = new X.2jq
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x00ad
        L_0x00c2:
            X.3d3 r4 = X.C72023d3.A00
        L_0x00c4:
            return r4
        L_0x00c5:
            boolean r0 = r7 instanceof X.AnonymousClass1P0
            if (r0 == 0) goto L_0x00ea
            r0 = r7
            X.1P0 r0 = (X.AnonymousClass1P0) r0
            X.5Xv r0 = r0.A00
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "privacy_always_relay"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            X.2jq r0 = new X.2jq
            r0.<init>(r2, r1)
            java.util.List r0 = X.C18290x4.A12(r0)
            return r0
        L_0x00ea:
            boolean r0 = r7 instanceof X.C22641Oz
            if (r0 == 0) goto L_0x010e
            r0 = r7
            X.1Oz r0 = (X.C22641Oz) r0
            X.33p r0 = r0.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "external_web_beta_is_opt_in"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            X.2jq r0 = new X.2jq
            r0.<init>(r2, r1)
            java.util.List r0 = X.C18290x4.A12(r0)
            return r0
        L_0x010e:
            X.3d3 r0 = X.C72023d3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0E():java.util.List");
    }

    public boolean A0F(AnonymousClass1SB r7) {
        Boolean bool;
        if (this instanceof AnonymousClass1P2) {
            AnonymousClass1P2 r5 = (AnonymousClass1P2) this;
            Object obj = r7.A01;
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            } else {
                bool = null;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C95814uZ A05 = C95814uZ.A00.A05(r7.A02);
                if (A05 != null) {
                    r5.A00.A00(r5.A02.A07(A05), booleanValue);
                }
            }
            return true;
        } else if (this instanceof AnonymousClass1P1) {
            AnonymousClass1P1 r3 = (AnonymousClass1P1) this;
            String str = r7.A02;
            Object obj2 = r7.A01;
            if (!(obj2 instanceof Boolean) || str == null) {
                return false;
            }
            boolean A1Z = AnonymousClass001.A1Z(obj2);
            C85064Eu r0 = (C85064Eu) ((C53232ml) r3.A04.get()).A04.get(str);
            if (r0 == null) {
                return true;
            }
            r0.BLm(A1Z);
            return true;
        } else if (this instanceof AnonymousClass1P0) {
            AnonymousClass1P0 r2 = (AnonymousClass1P0) this;
            Object obj3 = r7.A01;
            if (!(obj3 instanceof Boolean)) {
                return false;
            }
            C106155Xv r02 = r2.A00;
            C18270x1.A0l(r02.A03().edit(), "privacy_always_relay", AnonymousClass001.A1Z(obj3));
            return true;
        } else if (!(this instanceof C22641Oz)) {
            return true;
        } else {
            C22641Oz r22 = (C22641Oz) this;
            Object obj4 = r7.A01;
            if (!(obj4 instanceof Boolean)) {
                return false;
            }
            AnonymousClass33p r03 = r22.A01;
            C18270x1.A0l(C18270x1.A03(r03), "external_web_beta_is_opt_in", AnonymousClass001.A1Z(obj4));
            return true;
        }
    }

    public AnonymousClass1P3(C44322Vp r1, C623934v r2) {
        super(r2);
        this.A00 = r1;
    }
}
