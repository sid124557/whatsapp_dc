package X;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.R;
import com.whatsapp.dialogs.DeleteOrArchiveChatDialog;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4K4  reason: invalid class name */
public class AnonymousClass4K4 implements C15930sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4K4(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void BOf(Object obj) {
        AnonymousClass5ZM r5;
        AnonymousClass4FS r0;
        switch (this.A03) {
            case 0:
                C93314oJ r52 = (C93314oJ) this.A00;
                C89654ea r4 = (C89654ea) this.A01;
                C95814uZ r2 = (C95814uZ) this.A02;
                C95814uZ r13 = (C95814uZ) obj;
                if (r13 != null) {
                    String A0H = r52.A0v.A0H(r52.A0t.A0A(r13));
                    String A0D = r52.A0N.A0D(r2);
                    if (A0H != null) {
                        Object[] A0M = AnonymousClass002.A0M();
                        AnonymousClass000.A16(A0H, A0D, A0M);
                        String string = r4.getString(R.string.f11nameremoved, A0M);
                        View findViewById = r4.A00.findViewById(16908290);
                        if (findViewById == null) {
                            findViewById = r4.A00;
                        }
                        C88694ab A012 = C88694ab.A01(findViewById, string, -1);
                        A012.A0D(C18300x5.A03(r4, R.attr.f3nameremoved, R.color.f5nameremoved));
                        A012.A05();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C89654ea r53 = (C89654ea) this.A01;
                GroupJid groupJid = (GroupJid) this.A02;
                Map map = (Map) obj;
                if (map != null && map.size() >= 1) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator A0q = AnonymousClass000.A0q(map);
                    Long l = null;
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        AnonymousClass2L3 r22 = (AnonymousClass2L3) A0w.getValue();
                        if (r22 != null) {
                            if (l == null) {
                                l = Long.valueOf(r22.A00);
                            }
                            A0s.add(AnonymousClass0x9.A0R(A0w).getRawString());
                            A0s2.add(r22.A01);
                        }
                    }
                    Bundle A002 = PromptSendGroupInviteDialogFragment.A00(C627736r.A0W(r53, groupJid, l, A0s, A0s2, AnonymousClass001.A0s(), 3), map.keySet(), false);
                    PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = new PromptSendGroupInviteDialogFragment();
                    A002.putInt("invite_intent_code", -1);
                    promptSendGroupInviteDialogFragment.A0u(A002);
                    r53.Boo(promptSendGroupInviteDialogFragment);
                    return;
                }
                return;
            case 2:
                C93314oJ r54 = (C93314oJ) this.A00;
                Object obj2 = this.A01;
                C95814uZ r42 = (C95814uZ) this.A02;
                Map map2 = (Map) obj;
                if (map2 != null && map2.size() >= 1) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(AnonymousClass000.A0q(map2));
                    String A0H2 = r54.A0v.A0H(r54.A0t.A0A(C18320x8.A0N(A0w2)));
                    String A0D2 = r54.A0N.A0D(r42);
                    if (AnonymousClass0x2.A08(A0w2) == 409) {
                        r54.A0X.A0S(new C70493aa(r54, obj2, A0H2, A0D2, 1));
                        return;
                    } else if (map2.size() > 0) {
                        C18290x4.A1C(C66493Lq.A1H, map2, 3001);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                DeleteOrArchiveChatDialog deleteOrArchiveChatDialog = (DeleteOrArchiveChatDialog) this.A00;
                C95814uZ r3 = (C95814uZ) this.A01;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                C162457s7.A0J(compoundButton, 2);
                C162457s7.A0H(r3);
                boolean isChecked = compoundButton.isChecked();
                deleteOrArchiveChatDialog.A1K();
                C003203q A0R = deleteOrArchiveChatDialog.A0R();
                AnonymousClass0x9.A1L(A0R);
                C89654ea r1 = (C89654ea) A0R;
                C621033m r02 = deleteOrArchiveChatDialog.A01;
                if (r02 != null) {
                    r5 = new C33801ti(r1, r02, r3, isChecked);
                    r0 = deleteOrArchiveChatDialog.A04;
                    if (r0 == null) {
                        throw C18270x1.A0S("waWorkers");
                    }
                } else {
                    throw C18270x1.A0S("userActions");
                }
                break;
            default:
                C89704el r12 = (C89704el) this.A00;
                r5 = (AnonymousClass5ZM) this.A02;
                ((C06270Wx) this.A01).A0A(r12);
                r0 = r12.A04;
                break;
        }
        C18270x1.A0w(r5, r0);
    }
}
