package X;

import android.content.Context;
import android.text.Editable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.52S  reason: invalid class name */
public final class AnonymousClass52S extends C166677z5 {
    public int A00;
    public AnonymousClass6EC[] A01 = new AnonymousClass6EC[0];
    public final /* synthetic */ C112195jL A02;
    public final /* synthetic */ C87694Uy A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        List<AnonymousClass3ZL> list;
        C162457s7.A0J(charSequence, 0);
        if (i2 > 0) {
            C112195jL r0 = this.A02;
            AnonymousClass6EC[] r8 = this.A01;
            C162457s7.A0J(r8, 0);
            Editable text = r0.A05.getText();
            if (text != null) {
                for (AnonymousClass6EC r02 : r8) {
                    int spanStart = text.getSpanStart(r02);
                    int spanEnd = text.getSpanEnd(r02);
                    text.removeSpan(r02);
                    Integer[] numArr = new Integer[2];
                    AnonymousClass000.A1P(numArr, spanStart, 0);
                    AnonymousClass000.A1M(numArr, spanEnd);
                    if (!C18300x5.A1X(C73833g9.A06(numArr), -1)) {
                        text.delete(spanStart, spanEnd);
                    }
                }
            }
        }
        C87694Uy r7 = this.A03;
        MentionableEntry mentionableEntry = this.A02.A05;
        UserJid botMention = mentionableEntry.getBotMention();
        if (!C162457s7.A0P(botMention, r7.A01)) {
            r7.A01 = botMention;
            AnonymousClass4FS r1 = r7.A06;
            Runnable runnable = r7.A07;
            r1.BjN(runnable);
            r1.BkM(runnable);
        }
        String obj = charSequence.toString();
        List list2 = r7.A02;
        ArrayList arrayList2 = null;
        if (list2 != null) {
            arrayList = AnonymousClass001.A0s();
            for (Object next : list2) {
                String str = ((AnonymousClass3ZL) next).A01;
                C162457s7.A0J(obj, 0);
                int A0D = C175728Zm.A0D(obj, '/', obj.length() - 1);
                if (A0D != -1) {
                    String substring = obj.substring(A0D + 1);
                    C162457s7.A0D(substring);
                    if (!substring.equals(str)) {
                        C162457s7.A0J(str, 0);
                        if (str.startsWith(substring)) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        } else {
            arrayList = null;
        }
        AnonymousClass107 r3 = r7.A05;
        AnonymousClass5XT r12 = (AnonymousClass5XT) C86634Kw.A0v(r3);
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        r3.A0H(new AnonymousClass5XT(r12.A00, r12.A01, arrayList2));
        String obj2 = charSequence.toString();
        int A0G = C175728Zm.A0G(obj2, "/", 0, false);
        if (A0G != -1 && (list = r7.A02) != null) {
            for (AnonymousClass3ZL r03 : list) {
                String str2 = r03.A01;
                int length = str2.length();
                int i4 = length + A0G;
                C162457s7.A0J(obj2, 0);
                if (i4 <= obj2.length() - 1) {
                    String substring2 = obj2.substring(A0G, i4 + 1);
                    C162457s7.A0D(substring2);
                    if (substring2.equals(AnonymousClass0x2.A0e(str2, AnonymousClass001.A0o(), '/'))) {
                        if (charSequence.length() != this.A00) {
                            this.A00 = charSequence.length();
                            Context A0F = C18290x4.A0F(mentionableEntry);
                            int A04 = AnonymousClass0Y8.A04(A0F, C18290x4.A00(A0F));
                            Editable text2 = mentionableEntry.getText();
                            if (text2 != null) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append('/');
                                A0o.append(str2);
                                int A0G2 = C175728Zm.A0G(text2, AnonymousClass001.A0j(A0o, ' '), 0, false);
                                if (A0G2 != -1) {
                                    text2.setSpan(new AnonymousClass6EC(A04), A0G2, length + A0G2 + 1, 33);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public AnonymousClass52S(C112195jL r2, C87694Uy r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        MentionableEntry mentionableEntry = this.A02.A05;
        Object[] spans = mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), AnonymousClass6EC.class);
        C162457s7.A0D(spans);
        this.A01 = (AnonymousClass6EC[]) spans;
    }
}
