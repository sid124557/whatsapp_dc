package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Lt  reason: invalid class name */
public class AnonymousClass1Lt extends AnonymousClass3CG {
    public C40742Ho A00;

    public AnonymousClass1Lt(C40742Ho r6) {
        super("bk.action.UpdatedAvatarV2", "bk.action.DeletedAvatar", "bk.action.avatars.AsyncAvatarEditorLauncherClosed", "bk.action.avatar.AvatarEditorWANoticeEventSubmit", "bk.action.avatar.AvatarEditorEventSubmit");
        this.A00 = r6;
    }

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r6, C146787Bp r7, C151147Tp r8) {
        boolean z;
        C131266dJ r82 = (C131266dJ) r8;
        String str = r7.A00;
        char c = 65535;
        switch (str.hashCode()) {
            case -962275587:
                if (str.equals("bk.action.UpdatedAvatarV2")) {
                    c = 0;
                    break;
                }
                break;
            case 963920255:
                if (str.equals("bk.action.DeletedAvatar")) {
                    c = 1;
                    break;
                }
                break;
            case 1731322695:
                if (str.equals("bk.action.avatars.AsyncAvatarEditorLauncherClosed")) {
                    c = 2;
                    break;
                }
                break;
            case 1925160680:
                if (str.equals("bk.action.avatar.AvatarEditorWANoticeEventSubmit")) {
                    c = 3;
                    break;
                }
                break;
            case 2071347818:
                if (str.equals("bk.action.avatar.AvatarEditorEventSubmit")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                List list = r6.A00;
                Boolean bool = (Boolean) list.get(1);
                Boolean bool2 = (Boolean) list.get(2);
                C40742Ho r0 = this.A00;
                AnonymousClass8DJ.A01(r82);
                C29351ig r02 = r0.A00;
                boolean z2 = false;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                }
                C626936e.A01();
                Iterator A03 = C61102zi.A03(r02);
                while (A03.hasNext()) {
                    ((C85174Ff) A03.next()).BNA(z, z2);
                }
                break;
            case 1:
                C40742Ho r03 = this.A00;
                AnonymousClass8DJ.A01(r82);
                r03.A00.A09(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                return null;
            case 2:
                C29351ig r04 = this.A00.A00;
                C626936e.A01();
                Iterator A032 = C61102zi.A03(r04);
                while (A032.hasNext()) {
                    ((C85174Ff) A032.next()).BN7();
                }
                break;
            case 3:
                List list2 = r6.A00;
                String A0n = AnonymousClass001.A0n(list2, 0);
                Map map = (Map) AnonymousClass0x9.A0u(list2);
                C29351ig r05 = this.A00.A00;
                C626936e.A01();
                Iterator A033 = C61102zi.A03(r05);
                while (A033.hasNext()) {
                    ((C85174Ff) A033.next()).BN9(A0n, map);
                }
                break;
            case 4:
                String A0n2 = AnonymousClass001.A0n(r6.A00, 0);
                C29351ig r06 = this.A00.A00;
                C626936e.A01();
                Iterator A034 = C61102zi.A03(r06);
                while (A034.hasNext()) {
                    ((C85174Ff) A034.next()).BN8(A0n2);
                }
                break;
        }
        return null;
    }
}
