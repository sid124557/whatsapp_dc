package X;

import android.widget.AbsListView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;

/* renamed from: X.5ak  reason: invalid class name and case insensitive filesystem */
public class C107125ak implements AbsListView.OnScrollListener {
    public int A00;
    public Object A01;
    public final int A02 = 0;

    public C107125ak(PhoneContactsSelector phoneContactsSelector) {
        this.A01 = phoneContactsSelector;
        this.A00 = 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r2, int r3) {
        /*
            r1 = this;
            int r0 = r1.A02
            switch(r0) {
                case 2: goto L_0x0017;
                case 3: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            X.4eZ r0 = (X.C89644eZ) r0
            X.5Wv r0 = r0.A0B
        L_0x0011:
            r0.A02(r2)
        L_0x0014:
            r1.A00 = r3
            return
        L_0x0017:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            X.5Wv r0 = r0.A08
            goto L_0x0011
        L_0x0024:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r0 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r0
            X.5Wv r0 = r0.A07
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107125ak.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C107125ak(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        this.A01 = groupParticipantsSearchFragment;
        this.A00 = 0;
    }

    public C107125ak(C89634eX r2) {
        this.A01 = r2;
        this.A00 = 0;
    }

    public C107125ak(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        this.A01 = newsletterInfoMembersSearchFragment;
    }
}
