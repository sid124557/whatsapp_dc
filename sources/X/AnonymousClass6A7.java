package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.community.SubgroupWithParentView;

/* renamed from: X.6A7  reason: invalid class name */
public class AnonymousClass6A7 implements C15790rw {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6A7(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AwB(Object obj) {
        View view;
        int i;
        switch (this.A02) {
            case 0:
                SubgroupWithParentView subgroupWithParentView = (SubgroupWithParentView) this.A00;
                WaImageView waImageView = subgroupWithParentView.A02;
                int i2 = subgroupWithParentView.A01;
                ((C105365Uq) this.A01).A02(waImageView, new AnonymousClass760(subgroupWithParentView, 0), (AnonymousClass3ZH) obj, i2);
                return;
            case 1:
                C92154mB r6 = (C92154mB) this.A00;
                Context context = (Context) this.A01;
                if (obj != null && (view = r6.A04) != null) {
                    Object[] A0L = AnonymousClass002.A0L();
                    C18290x4.A1K(r6.A0h, r6.A0L, A0L);
                    C86624Kv.A0h(context, view, A0L, R.string.f11nameremoved);
                    C107295b4.A03(view, R.string.f11nameremoved);
                    C109725f5.A00(view, r6, context, obj, 32);
                    return;
                }
                return;
            default:
                AnonymousClass5ZM r0 = (AnonymousClass5ZM) this.A00;
                Number number = (Number) this.A01;
                C89654ea r8 = (C89654ea) obj;
                int intValue = number.intValue();
                if (intValue == 0) {
                    Intent A07 = C18320x8.A07();
                    A07.setData((Uri) r8.getIntent().getParcelableExtra("emojiEditorImageResult"));
                    A07.putExtra("emojiEditorImageResult", r8.getIntent().getParcelableExtra("emojiEditorImageResult"));
                    A07.putExtra("skip_cropping", true);
                    AnonymousClass0x2.A0m(r8, A07);
                    return;
                } else if (!C18320x8.A1T(r0)) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "GroupProfileEmojiEditor/render/error ", number);
                    if (intValue == -2) {
                        boolean A012 = C61072zf.A01();
                        i = R.string.f11nameremoved;
                        if (A012) {
                            i = R.string.f11nameremoved;
                        }
                    } else if (intValue == -3) {
                        i = R.string.f11nameremoved;
                    } else {
                        r8.A05.A0H(R.string.f11nameremoved, 1);
                        return;
                    }
                    r8.Bot(i);
                    return;
                } else {
                    return;
                }
        }
    }
}
