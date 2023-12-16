package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.5zm  reason: invalid class name and case insensitive filesystem */
public final class C121165zm extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r7 = r15
            X.73X r7 = (X.AnonymousClass73X) r7
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            boolean r0 = r7 instanceof X.C132096eg
            if (r0 == 0) goto L_0x00c7
            X.6eg r7 = (X.C132096eg) r7
            if (r7 == 0) goto L_0x00c7
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r14.this$0
            X.66R r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r2 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarProfilePhotoViewModel/onBackgroundColorSelected(item="
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A04(r7, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.08M r4 = r2.A00
            java.lang.Object r0 = r4.A07()
            X.5Z8 r0 = (X.AnonymousClass5Z8) r0
            if (r0 == 0) goto L_0x005e
            java.util.List r0 = r0.A02
            java.util.ArrayList r10 = X.C73783g4.A0d(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x003d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r6.next()
            X.6eg r1 = (X.C132096eg) r1
            int r5 = r1.A00
            int r0 = r7.A00
            boolean r3 = X.AnonymousClass000.A1U(r5, r0)
            int r2 = r1.A01
            java.lang.String r1 = r1.A02
            X.6eg r0 = new X.6eg
            r0.<init>(r5, r2, r1, r3)
            r10.add(r0)
            goto L_0x003d
        L_0x005e:
            X.3d3 r10 = X.C72023d3.A00
        L_0x0060:
            java.lang.Object r0 = r4.A07()
            X.5Z8 r0 = (X.AnonymousClass5Z8) r0
            if (r0 == 0) goto L_0x00ae
            java.util.List r0 = r0.A03
            java.util.ArrayList r9 = X.C73783g4.A0d(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0072:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r5 = r6.next()
            X.6ef r5 = (X.C132086ef) r5
            boolean r0 = r5 instanceof X.C132076ee
            if (r0 == 0) goto L_0x0095
            X.6ee r5 = (X.C132076ee) r5
            int r0 = r7.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.A01
            X.6ee r5 = new X.6ee
            r5.<init>(r1, r0)
        L_0x0091:
            r9.add(r5)
            goto L_0x0072
        L_0x0095:
            boolean r0 = r5 instanceof X.C132066ed
            if (r0 == 0) goto L_0x00a9
            X.6ed r5 = (X.C132066ed) r5
            int r3 = r7.A01
            android.graphics.Bitmap r2 = r5.A01
            java.lang.String r1 = r5.A02
            boolean r0 = r5.A03
            X.6ed r5 = new X.6ed
            r5.<init>(r2, r1, r3, r0)
            goto L_0x0091
        L_0x00a9:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00ae:
            X.3d3 r9 = X.C72023d3.A00
        L_0x00b0:
            X.5Z8 r0 = X.C86654Ky.A0R(r4)
            boolean r11 = r0.A06
            X.6ed r8 = r0.A01
            boolean r12 = r0.A05
            boolean r13 = r0.A04
            X.5Z8 r6 = new X.5Z8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.A0H(r6)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00c7:
            java.lang.String r0 = "Adapter can only handle background colors."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121165zm.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121165zm(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }
}
