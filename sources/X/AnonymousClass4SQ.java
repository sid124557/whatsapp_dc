package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.CodeInputField;
import com.whatsapp.WaEditText;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.text.FinalBackspaceAwareEntry;

/* renamed from: X.4SQ  reason: invalid class name */
public abstract class AnonymousClass4SQ extends AnonymousClass03A implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A01(C64333Db r1, WaEditText waEditText) {
        waEditText.A03 = (C620733j) r1.AbU.get();
        waEditText.A02 = (C620633i) r1.AYG.get();
    }

    public void A04() {
        if (this instanceof FinalBackspaceAwareEntry) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this;
            if (!finalBackspaceAwareEntry.A03) {
                finalBackspaceAwareEntry.A03 = true;
                C64333Db A002 = C88864av.A00(finalBackspaceAwareEntry.generatedComponent());
                A01(A002, finalBackspaceAwareEntry);
                finalBackspaceAwareEntry.A03 = C64333Db.A4B(A002);
            }
        } else if (this instanceof C92304mR) {
            C92304mR r1 = (C92304mR) this;
            if (r1 instanceof StatusEditText) {
                StatusEditText statusEditText = (StatusEditText) r1;
                if (!statusEditText.A00) {
                    statusEditText.A00 = true;
                    C64333Db A003 = C88864av.A00(statusEditText.generatedComponent());
                    A01(A003, statusEditText);
                    statusEditText.A03 = C64333Db.A4B(A003);
                    statusEditText.A03 = C86644Kx.A0b(A003);
                    statusEditText.A00 = C64333Db.A06(A003);
                    statusEditText.A02 = C64333Db.A2s(A003);
                    statusEditText.A0H = (C106195Xz) A003.AKJ.get();
                    statusEditText.A09 = C64333Db.A39(A003);
                    statusEditText.A08 = C86644Kx.A0T(A003);
                    statusEditText.A0J = C72343dZ.A00(A003.A32);
                    statusEditText.A07 = C88734ai.A00(A003.A32);
                    statusEditText.A0A = C64333Db.A3G(A003);
                    statusEditText.A0I = C64333Db.A74(A003);
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                MentionableEntry mentionableEntry = (MentionableEntry) r1;
                C64333Db r2 = ((C88864av) ((C111685iW) r1.generatedComponent())).A0K;
                A01(r2, mentionableEntry);
                mentionableEntry.A03 = C64333Db.A4B(r2);
                mentionableEntry.A03 = C86644Kx.A0b(r2);
                mentionableEntry.A00 = C64333Db.A06(r2);
                mentionableEntry.A02 = C64333Db.A2s(r2);
                mentionableEntry.A0H = (C106195Xz) r2.AKJ.get();
                mentionableEntry.A09 = C64333Db.A39(r2);
                mentionableEntry.A08 = C86644Kx.A0T(r2);
                mentionableEntry.A0J = C72343dZ.A00(r2.A32);
                mentionableEntry.A07 = C88734ai.A00(r2.A32);
                mentionableEntry.A0A = C64333Db.A3G(r2);
                mentionableEntry.A0I = C64333Db.A74(r2);
            }
        } else if (this instanceof DoodleEditText) {
            DoodleEditText doodleEditText = (DoodleEditText) this;
            if (!doodleEditText.A04) {
                doodleEditText.A04 = true;
                A01(C88864av.A00(doodleEditText.generatedComponent()), doodleEditText);
            }
        } else if (this instanceof C89724en) {
            C89724en r12 = (C89724en) this;
            if (!r12.A00) {
                r12.A00 = true;
                A01(C88864av.A00(r12.generatedComponent()), r12);
            }
        } else if (this instanceof CodeInputField) {
            CodeInputField codeInputField = (CodeInputField) this;
            if (!codeInputField.A06) {
                codeInputField.A06 = true;
                A01(C88864av.A00(codeInputField.generatedComponent()), codeInputField);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A01(((C88864av) ((C111685iW) generatedComponent())).A0K, (WaEditText) this);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4SQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
    }

    public static String A00(MentionableEntry mentionableEntry) {
        return C624435a.A01(mentionableEntry.getMentions());
    }

    public AnonymousClass4SQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
    }

    public AnonymousClass4SQ(Context context) {
        super(context, (AttributeSet) null);
        A04();
    }
}
