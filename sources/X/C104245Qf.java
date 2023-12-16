package X;

/* renamed from: X.5Qf  reason: invalid class name and case insensitive filesystem */
public final class C104245Qf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C186058ug A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C104245Qf(C186058ug r2, String str, String str2, int i, int i2, int i3, boolean z) {
        C162457s7.A0J(str2, 4);
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r2;
        this.A00 = i3;
        this.A06 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3 >= 4) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r10, android.os.Bundle r11, int r12) {
        /*
            r9 = this;
            r5 = 0
            int r3 = r9.A02
            r0 = 9
            java.lang.String r2 = "bucketId"
            if (r3 == r0) goto L_0x013a
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            X.C162457s7.A0F(r1)
            r0 = 4
            if (r3 < r0) goto L_0x001e
        L_0x0011:
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = r9.A04
            android.net.Uri r1 = X.C18290x4.A0H(r1, r2, r0)
            X.C162457s7.A0D(r1)
        L_0x001e:
            android.content.Intent r6 = r10.getIntent()
            android.content.Intent r4 = X.C18310x6.A0D(r1)
            java.lang.String r1 = "window_title"
            java.lang.String r0 = r9.A05
            r4.putExtra(r1, r0)
            r1 = 7
            switch(r3) {
                case 0: goto L_0x0131;
                case 1: goto L_0x0134;
                case 2: goto L_0x0137;
                case 3: goto L_0x0031;
                case 4: goto L_0x0131;
                case 5: goto L_0x0134;
                case 6: goto L_0x0137;
                default: goto L_0x0031;
            }
        L_0x0031:
            int r0 = r9.A01
            r1 = r1 & r0
            java.lang.String r0 = "include_media"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "preview"
            r7 = 1
            if (r11 == 0) goto L_0x012e
            boolean r0 = r11.getBoolean(r1, r7)
        L_0x0042:
            r4.putExtra(r1, r0)
            java.lang.String r8 = "quoted_message_row_id"
            r0 = 0
            if (r11 == 0) goto L_0x012a
            long r2 = r11.getLong(r8, r0)
        L_0x004f:
            r4.putExtra(r8, r2)
            java.lang.String r3 = "quoted_group_jid"
            r8 = 0
            if (r11 == 0) goto L_0x0127
            java.lang.String r2 = r11.getString(r3)
        L_0x005b:
            r4.putExtra(r3, r2)
            java.lang.String r3 = "jid"
            if (r11 == 0) goto L_0x0124
            java.lang.String r2 = r11.getString(r3)
        L_0x0066:
            r4.putExtra(r3, r2)
            java.lang.String r3 = "android.intent.extra.TEXT"
            if (r11 == 0) goto L_0x0121
            java.lang.String r2 = r11.getString(r3)
        L_0x0071:
            r4.putExtra(r3, r2)
            java.lang.String r2 = "max_items"
            if (r11 == 0) goto L_0x007c
            int r12 = r11.getInt(r2, r12)
        L_0x007c:
            r4.putExtra(r2, r12)
            java.lang.String r3 = "skip_max_items_new_limit"
            if (r11 == 0) goto L_0x011e
            boolean r2 = r11.getBoolean(r3)
        L_0x0087:
            r4.putExtra(r3, r2)
            java.lang.String r3 = "is_in_multi_select_mode_only"
            if (r11 == 0) goto L_0x011b
            boolean r2 = r11.getBoolean(r3)
        L_0x0092:
            r4.putExtra(r3, r2)
            java.lang.String r2 = "mentions"
            if (r11 == 0) goto L_0x009d
            java.lang.String r8 = r11.getString(r2)
        L_0x009d:
            r4.putExtra(r2, r8)
            java.lang.String r2 = "picker_open_time"
            if (r11 == 0) goto L_0x00a8
            long r0 = r11.getLong(r2, r0)
        L_0x00a8:
            r4.putExtra(r2, r0)
            java.lang.String r0 = "should_send_media"
            if (r11 == 0) goto L_0x00b3
            boolean r7 = r11.getBoolean(r0, r7)
        L_0x00b3:
            r4.putExtra(r0, r7)
            java.lang.String r1 = "should_hide_caption_view"
            if (r11 == 0) goto L_0x0119
            boolean r0 = r11.getBoolean(r1, r5)
        L_0x00be:
            r4.putExtra(r1, r0)
            java.lang.String r1 = "should_set_gallery_result"
            if (r11 == 0) goto L_0x0117
            boolean r0 = r11.getBoolean(r1, r5)
        L_0x00c9:
            r4.putExtra(r1, r0)
            java.lang.String r1 = "is_favorite_filter_enabled"
            boolean r0 = r9.A06
            r4.putExtra(r1, r0)
            java.lang.String r1 = "is_send_as_document"
            if (r11 == 0) goto L_0x0115
            boolean r0 = r11.getBoolean(r1, r5)
        L_0x00db:
            r4.putExtra(r1, r0)
            java.lang.String r0 = "com.whatsapp.gallery.NewMediaPicker"
            r4.setClassName(r10, r0)
            X.C162457s7.A0H(r6)
            java.lang.String r3 = "camera_origin"
            boolean r1 = r6.hasExtra(r3)
            java.lang.String r2 = "origin"
            r0 = 1
            if (r1 == 0) goto L_0x010e
            int r1 = r6.getIntExtra(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r0 = X.C154277cu.A00(r0, r1, r5)
        L_0x00fb:
            r4.putExtra(r2, r0)
            X.0PJ[] r0 = new X.AnonymousClass0PJ[r5]
            X.0Vi r0 = X.C05880Vi.A01(r10, r0)
            android.os.Bundle r1 = r0.A02()
            r0 = 90
            X.C05680Um.A02(r10, r4, r1, r0)
            return
        L_0x010e:
            if (r11 == 0) goto L_0x00fb
            int r0 = r11.getInt(r2, r0)
            goto L_0x00fb
        L_0x0115:
            r0 = 0
            goto L_0x00db
        L_0x0117:
            r0 = 0
            goto L_0x00c9
        L_0x0119:
            r0 = 0
            goto L_0x00be
        L_0x011b:
            r2 = 0
            goto L_0x0092
        L_0x011e:
            r2 = 0
            goto L_0x0087
        L_0x0121:
            r2 = r8
            goto L_0x0071
        L_0x0124:
            r2 = r8
            goto L_0x0066
        L_0x0127:
            r2 = r8
            goto L_0x005b
        L_0x012a:
            r2 = 0
            goto L_0x004f
        L_0x012e:
            r0 = 1
            goto L_0x0042
        L_0x0131:
            r1 = 1
            goto L_0x0031
        L_0x0134:
            r1 = 4
            goto L_0x0031
        L_0x0137:
            r1 = 2
            goto L_0x0031
        L_0x013a:
            android.net.Uri r1 = X.C95324tN.A00
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104245Qf.A01(android.app.Activity, android.os.Bundle, int):void");
    }

    public final String A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append('-');
        A0o.append(this.A04);
        A0o.append('-');
        A0o.append(this.A01);
        A0o.append('-');
        return C18300x5.A0m(A0o, this.A06);
    }
}
