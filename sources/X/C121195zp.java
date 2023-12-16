package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.5zp  reason: invalid class name and case insensitive filesystem */
public final class C121195zp extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            r7 = r14
            X.73X r7 = (X.AnonymousClass73X) r7
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            boolean r0 = r7 instanceof X.C132066ed
            if (r0 == 0) goto L_0x0093
            X.6ed r7 = (X.C132066ed) r7
            if (r7 == 0) goto L_0x0093
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r13.this$0
            X.66R r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r2 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarProfilePhotoViewModel/onPoseSelected(item="
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A04(r7, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.08M r4 = r2.A00
            java.lang.Object r0 = r4.A07()
            X.5Z8 r0 = (X.AnonymousClass5Z8) r0
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = r0.A03
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x003d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C132066ed
            if (r0 == 0) goto L_0x003d
            r3.add(r1)
            goto L_0x003d
        L_0x004f:
            java.util.ArrayList r8 = X.C73783g4.A0c(r3)
            java.util.Iterator r6 = r3.iterator()
        L_0x0057:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r6.next()
            X.6ed r1 = (X.C132066ed) r1
            android.graphics.Bitmap r5 = r1.A01
            android.graphics.Bitmap r0 = r7.A01
            boolean r3 = X.C162457s7.A0P(r5, r0)
            java.lang.String r2 = r1.A02
            int r1 = r1.A00
            X.6ed r0 = new X.6ed
            r0.<init>(r5, r2, r1, r3)
            r8.add(r0)
            goto L_0x0057
        L_0x0078:
            X.3d3 r8 = X.C72023d3.A00
        L_0x007a:
            X.5Z8 r0 = X.C86654Ky.A0R(r4)
            boolean r10 = r0.A06
            java.util.List r9 = r0.A02
            X.6eg r6 = r0.A00
            boolean r11 = r0.A05
            boolean r12 = r0.A04
            X.5Z8 r5 = new X.5Z8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.A0H(r5)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0093:
            java.lang.String r0 = "Adapter can only handle poses."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121195zp.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121195zp(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }
}
