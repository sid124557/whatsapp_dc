package X;

import android.view.View;
import com.whatsapp.community.CommunityMembersActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import java.util.List;

/* renamed from: X.5Br  reason: invalid class name and case insensitive filesystem */
public class C100635Br implements C15930sC {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C100635Br(C15630rg r2, AnonymousClass08J r3) {
        this.A03 = 3;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = false;
    }

    public final void BOf(Object obj) {
        int i;
        View view;
        List list;
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                CommunityMembersActivity communityMembersActivity = (CommunityMembersActivity) this.A00;
                AnonymousClass4X5 r8 = (AnonymousClass4X5) this.A01;
                boolean z = this.A02;
                List list2 = (List) obj2;
                communityMembersActivity.A60("load_community_member");
                List list3 = r8.A0N;
                if (list3.size() == 0 || (list3.size() == 1 && r8.A0B(0) == 0)) {
                    communityMembersActivity.A61("render_community_member");
                    communityMembersActivity.A74(r8, list2, z);
                    communityMembersActivity.A60("render_community_member");
                    if (list2.size() > 0) {
                        AnonymousClass5ND r3 = communityMembersActivity.A00;
                        r3.A01.A0C("member_count", false, Integer.toString(list2.size()));
                        communityMembersActivity.BKe(2);
                        return;
                    }
                    return;
                }
                communityMembersActivity.A05.A0R(communityMembersActivity.A0J);
                C71643cR r6 = new C71643cR(communityMembersActivity, r8, list2, 7, z);
                communityMembersActivity.A0J = r6;
                communityMembersActivity.A05.A0T(r6, 500);
                return;
            case 1:
                boolean z2 = this.A02;
                boolean A1Z = AnonymousClass001.A1Z(obj);
                i = 0;
                ((View) this.A01).setVisibility(AnonymousClass001.A08(A1Z ? 1 : 0));
                view = ((AnonymousClass5PD) this.A00).A03;
                if (!z2 || A1Z) {
                    i = 8;
                    break;
                }
            case 2:
                DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = (DownloadableWallpaperPickerActivity) this.A00;
                boolean z3 = this.A02;
                View view2 = (View) this.A01;
                AnonymousClass7IK r9 = (AnonymousClass7IK) obj2;
                int i2 = r9.A00;
                int i3 = 1;
                i = 8;
                if (i2 == 2) {
                    AnonymousClass7IJ r0 = r9.A01;
                    C626936e.A06(r0);
                    if (z3) {
                        list = r0.A01;
                    } else {
                        list = r0.A00;
                    }
                    downloadableWallpaperPickerActivity.A07 = list;
                    downloadableWallpaperPickerActivity.A01.setVisibility(8);
                    downloadableWallpaperPickerActivity.A00.setVisibility(8);
                    downloadableWallpaperPickerActivity.A03.setVisibility(0);
                    view2.setEnabled(false);
                    AnonymousClass0PJ r2 = downloadableWallpaperPickerActivity.A02;
                    if (r2 == null) {
                        i3 = 0;
                    }
                    downloadableWallpaperPickerActivity.A06.A0K(r2, downloadableWallpaperPickerActivity.A07, i3);
                    return;
                } else if (i2 == 1) {
                    view2.setEnabled(false);
                    downloadableWallpaperPickerActivity.A01.setVisibility(0);
                    downloadableWallpaperPickerActivity.A00.setVisibility(8);
                    view = downloadableWallpaperPickerActivity.A03;
                    break;
                } else {
                    downloadableWallpaperPickerActivity.A01.setVisibility(8);
                    downloadableWallpaperPickerActivity.A00.setVisibility(0);
                    downloadableWallpaperPickerActivity.A03.setVisibility(8);
                    view2.setEnabled(true);
                    return;
                }
            default:
                if (this.A02 || AnonymousClass001.A1Z(((C15630rg) this.A00).apply(obj))) {
                    this.A02 = true;
                    ((C06270Wx) this.A01).A0H(obj);
                    return;
                }
                return;
        }
        view.setVisibility(i);
    }

    public C100635Br(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = z;
        this.A01 = obj;
    }
}
