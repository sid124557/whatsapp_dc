package X;

/* renamed from: X.55t  reason: invalid class name and case insensitive filesystem */
public final class C994455t extends C173778Rq {
    public final C147187Dd A00;
    public final String A01;
    public volatile boolean A02;
    public final /* synthetic */ AnonymousClass5OL A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C994455t(C147187Dd r2, AnonymousClass5OL r3, String str) {
        super("LinkifierThread");
        this.A03 = r3;
        this.A00 = r2;
        this.A01 = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:12|13|14|(1:16)|17|(2:19|(2:22|20))|23|24|(1:26)(1:36)|27|(1:29)|30|(3:32|(2:35|33)|68)|37|(4:41|(3:43|(3:45|(2:53|70)|54)|69)|55|(2:57|67)(1:66))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00dd */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e3 A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4 A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010a A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0167 A[Catch:{ InterruptedException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r13 = r16
            boolean r0 = r13.A02     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 != 0) goto L_0x0177
            X.7Dd r0 = r13.A00     // Catch:{ InterruptedException -> 0x0177 }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x0177 }
            java.lang.Object r0 = r0.takeLast()     // Catch:{ InterruptedException -> 0x0177 }
            X.5J7 r0 = (X.AnonymousClass5J7) r0     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x0005
            java.lang.CharSequence r8 = r0.A03     // Catch:{ InterruptedException -> 0x0177 }
            android.widget.TextView r14 = r0.A00     // Catch:{ InterruptedException -> 0x0177 }
            X.34x r10 = r0.A02     // Catch:{ InterruptedException -> 0x0177 }
            X.8o1 r9 = r0.A01     // Catch:{ InterruptedException -> 0x0177 }
            java.lang.Object r1 = r14.getTag()     // Catch:{ InterruptedException -> 0x0177 }
            boolean r0 = r1 instanceof X.C624134x     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x0174
            X.34x r1 = (X.C624134x) r1     // Catch:{ InterruptedException -> 0x0177 }
            X.2z0 r0 = r1.A1J     // Catch:{ InterruptedException -> 0x0177 }
        L_0x002b:
            X.2z0 r1 = r10.A1J     // Catch:{ InterruptedException -> 0x0177 }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x0005
            android.text.SpannableStringBuilder r11 = X.C18330xA.A00(r8)     // Catch:{ InterruptedException -> 0x0177 }
            X.5OL r12 = r13.A03     // Catch:{ InterruptedException -> 0x0177 }
            X.5a2 r7 = r12.A05     // Catch:{ InterruptedException -> 0x0177 }
            java.lang.String r2 = r13.A01     // Catch:{ InterruptedException -> 0x0177 }
            r0 = 2
            android.text.util.Linkify.addLinks(r11, r0)     // Catch:{ Exception -> 0x00dd }
            X.5Zz r0 = r7.A07     // Catch:{ Exception -> 0x00dd }
            r0.A06(r11)     // Catch:{ Exception -> 0x00dd }
            X.C106715a2.A02(r11, r2)     // Catch:{ Exception -> 0x00dd }
            X.9U4 r2 = r7.A0A     // Catch:{ Exception -> 0x00dd }
            X.99n r0 = r7.A09     // Catch:{ Exception -> 0x00dd }
            X.C106715a2.A00(r11, r0, r2)     // Catch:{ Exception -> 0x00dd }
            X.C106715a2.A01(r11, r0, r2)     // Catch:{ Exception -> 0x00dd }
            java.util.regex.Pattern r0 = X.C1458877r.A00     // Catch:{ Exception -> 0x00dd }
            java.util.regex.Matcher r2 = r0.matcher(r11)     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r2.find()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x0072
            int r3 = r2.start()     // Catch:{ Exception -> 0x00dd }
            int r2 = r2.end()     // Catch:{ Exception -> 0x00dd }
            java.lang.CharSequence r0 = r11.subSequence(r3, r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00dd }
            X.C86644Kx.A0t(r11, r0, r3, r2)     // Catch:{ Exception -> 0x00dd }
        L_0x0072:
            X.5Gb r0 = r7.A08     // Catch:{ Exception -> 0x00dd }
            X.1VX r2 = r0.A00     // Catch:{ Exception -> 0x00dd }
            r0 = 6151(0x1807, float:8.62E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00dd
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "(?:"
            r2.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "R\\$|\\$|S\\/|S\\/\\.|Rp|₪|د\\.إ|TL"
            r2.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = ")\\s*\\d+([.,]\\d{2})?\\b"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ Exception -> 0x00dd }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00dd }
            java.util.regex.Matcher r5 = r0.matcher(r11)     // Catch:{ Exception -> 0x00dd }
        L_0x009a:
            boolean r0 = r5.find()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00dd
            int r0 = r5.start()     // Catch:{ Exception -> 0x00dd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00dd }
            int r0 = r5.end()     // Catch:{ Exception -> 0x00dd }
            android.util.Pair r2 = X.C18290x4.A0K(r2, r0)     // Catch:{ Exception -> 0x00dd }
            X.5WU r0 = X.C106335Yo.A01     // Catch:{ Exception -> 0x00dd }
            android.util.Pair r2 = X.C106335Yo.A00(r2, r0, r11)     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00dd }
            X.C162457s7.A0C(r0)     // Catch:{ Exception -> 0x00dd }
            int r4 = X.AnonymousClass001.A0K(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r0 = r2.second     // Catch:{ Exception -> 0x00dd }
            X.C162457s7.A0C(r0)     // Catch:{ Exception -> 0x00dd }
            int r3 = X.AnonymousClass001.A0K(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "order:"
            r2.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.CharSequence r0 = r11.subSequence(r4, r3)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r2)     // Catch:{ Exception -> 0x00dd }
            X.C86644Kx.A0t(r11, r0, r4, r3)     // Catch:{ Exception -> 0x00dd }
            goto L_0x009a
        L_0x00dd:
            X.5O2 r3 = r7.A03     // Catch:{ InterruptedException -> 0x0177 }
            boolean r0 = r1.A02     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x010a
            X.2sr r0 = r3.A00     // Catch:{ InterruptedException -> 0x0177 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r0)     // Catch:{ InterruptedException -> 0x0177 }
        L_0x00e9:
            X.4uZ r0 = r1.A00     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x00f0
            r3.A00(r11, r0, r2)     // Catch:{ InterruptedException -> 0x0177 }
        L_0x00f0:
            java.util.List r0 = r10.A18     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x010f
            java.util.Iterator r1 = r0.iterator()     // Catch:{ InterruptedException -> 0x0177 }
        L_0x00f8:
            boolean r0 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r1.next()     // Catch:{ InterruptedException -> 0x0177 }
            X.3ZM r0 = (X.AnonymousClass3ZM) r0     // Catch:{ InterruptedException -> 0x0177 }
            X.4uZ r0 = r0.A00     // Catch:{ InterruptedException -> 0x0177 }
            r3.A00(r11, r0, r2)     // Catch:{ InterruptedException -> 0x0177 }
            goto L_0x00f8
        L_0x010a:
            com.whatsapp.jid.UserJid r2 = r10.A0o()     // Catch:{ InterruptedException -> 0x0177 }
            goto L_0x00e9
        L_0x010f:
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            java.util.List r0 = X.C107635bd.A0C(r11)     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.isEmpty()     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 != 0) goto L_0x0005
            int r0 = r11.length()     // Catch:{ InterruptedException -> 0x0177 }
            r6 = 0
            java.lang.Object[] r5 = r11.getSpans(r6, r0, r1)     // Catch:{ InterruptedException -> 0x0177 }
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5     // Catch:{ InterruptedException -> 0x0177 }
            if (r5 == 0) goto L_0x0154
            int r4 = r5.length     // Catch:{ InterruptedException -> 0x0177 }
        L_0x012b:
            if (r6 >= r4) goto L_0x0154
            r3 = r5[r6]     // Catch:{ InterruptedException -> 0x0177 }
            if (r3 == 0) goto L_0x0151
            java.lang.String r2 = r3.getURL()     // Catch:{ InterruptedException -> 0x0177 }
            if (r2 == 0) goto L_0x0151
            X.5nM r1 = r7.A06     // Catch:{ InterruptedException -> 0x0177 }
            com.whatsapp.jid.UserJid r0 = r10.A0o()     // Catch:{ InterruptedException -> 0x0177 }
            java.util.Set r1 = r1.BBH(r0, r10, r2)     // Catch:{ InterruptedException -> 0x0177 }
            if (r1 == 0) goto L_0x0151
            boolean r0 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 != 0) goto L_0x0151
            X.4Mq r0 = new X.4Mq     // Catch:{ InterruptedException -> 0x0177 }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x0177 }
            X.AnonymousClass75N.A00(r11, r11, r3, r0)     // Catch:{ InterruptedException -> 0x0177 }
        L_0x0151:
            int r6 = r6 + 1
            goto L_0x012b
        L_0x0154:
            X.0Qw r2 = r12.A01     // Catch:{ InterruptedException -> 0x0177 }
            java.lang.String r1 = r8.toString()     // Catch:{ InterruptedException -> 0x0177 }
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r11)     // Catch:{ InterruptedException -> 0x0177 }
            r2.A08(r1, r0)     // Catch:{ InterruptedException -> 0x0177 }
            boolean r0 = X.C86664Kz.A1U(r14, r10)     // Catch:{ InterruptedException -> 0x0177 }
            if (r0 == 0) goto L_0x0005
            X.3Wi r0 = r12.A02     // Catch:{ InterruptedException -> 0x0177 }
            r15 = 5
            X.3cZ r8 = new X.3cZ     // Catch:{ InterruptedException -> 0x0177 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x0177 }
            r0.A0S(r8)     // Catch:{ InterruptedException -> 0x0177 }
            goto L_0x0005
        L_0x0174:
            r0 = 0
            goto L_0x002b
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C994455t.run():void");
    }
}
