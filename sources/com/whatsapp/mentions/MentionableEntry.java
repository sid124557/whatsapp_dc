package com.whatsapp.mentions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass24P;
import X.AnonymousClass32X;
import X.AnonymousClass34R;
import X.AnonymousClass3ZH;
import X.AnonymousClass3ZM;
import X.AnonymousClass4FS;
import X.AnonymousClass4NI;
import X.AnonymousClass4SQ;
import X.AnonymousClass5RR;
import X.AnonymousClass5TH;
import X.AnonymousClass5WS;
import X.AnonymousClass5Yj;
import X.AnonymousClass65O;
import X.AnonymousClass6EC;
import X.AnonymousClass6ED;
import X.AnonymousClass6EE;
import X.AnonymousClass7HU;
import X.AnonymousClass7IU;
import X.AnonymousClass8F0;
import X.C106195Xz;
import X.C109135e8;
import X.C110465gH;
import X.C113905mB;
import X.C116985rC;
import X.C129526aS;
import X.C162457s7;
import X.C171498Hh;
import X.C172878Nf;
import X.C179518jH;
import X.C179618jR;
import X.C18260x0;
import X.C18270x1;
import X.C182728ot;
import X.C182738ou;
import X.C18280x3;
import X.C18290x4;
import X.C18330xA;
import X.C183538qC;
import X.C27991fJ;
import X.C56892sj;
import X.C56982ss;
import X.C58152un;
import X.C60152y5;
import X.C60842zG;
import X.C620633i;
import X.C624435a;
import X.C626936e;
import X.C627336j;
import X.C71433c6;
import X.C86624Kv;
import X.C86664Kz;
import X.C87694Uy;
import X.C89654ea;
import X.C92304mR;
import X.C95814uZ;
import X.C991954u;
import X.C996357k;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MentionableEntry extends C92304mR implements C182728ot, AnonymousClass65O, C179618jR {
    public static final String[] A0O = AnonymousClass5WS.A01;
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public C116985rC A07;
    public C113905mB A08;
    public C56982ss A09;
    public C56892sj A0A;
    public C95814uZ A0B;
    public C182728ot A0C;
    public MentionPickerView A0D;
    public AnonymousClass6ED A0E;
    public C182738ou A0F;
    public C179518jH A0G;
    public C106195Xz A0H;
    public C60152y5 A0I;
    public C183538qC A0J;
    public boolean A0K;
    public boolean A0L;
    public final TextWatcher A0M = new C109135e8(this);
    public final AnonymousClass5RR A0N = new AnonymousClass5RR();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 != '_') goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(android.text.Editable r8) {
        /*
            r7 = this;
            r0 = 0
            int r3 = r7.A0A(r8, r0)
            int r2 = r3 + 1
            int r1 = r7.getSelectionEnd()
            java.lang.Class<X.6EE> r0 = X.AnonymousClass6EE.class
            java.lang.Object[] r6 = r8.getSpans(r2, r1, r0)
            X.6EE[] r6 = (X.AnonymousClass6EE[]) r6
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0032
            r4 = 0
            r3 = 0
        L_0x0018:
            r2 = r6[r4]
            int r1 = r8.getSpanEnd(r2)
            if (r1 <= r3) goto L_0x002a
            int r0 = r7.getSelectionEnd()
            if (r1 > r0) goto L_0x002a
            int r3 = r8.getSpanEnd(r2)
        L_0x002a:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0018
            int r3 = r7.A0A(r8, r3)
        L_0x0032:
            if (r3 < 0) goto L_0x0047
            r0 = 1
            if (r3 == 0) goto L_0x0051
            int r0 = r3 - r0
            char r1 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            if (r0 != 0) goto L_0x0047
            r0 = 95
            if (r1 != r0) goto L_0x0051
        L_0x0047:
            X.6ED r0 = r7.A0E
            r7.A0G(r0)
            r0 = 0
            r7.A0J(r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r2 = r8.toString()
            int r1 = r3 + 1
            int r0 = r7.getSelectionEnd()
            java.lang.String r0 = r2.substring(r1, r0)
            r7.A0J(r0)
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0050
            r7.A0E(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionableEntry.A0D(android.text.Editable):void");
    }

    public void A0C() {
        removeTextChangedListener(this.A0M);
        setText((String) null);
        setCursorVisible(false);
    }

    public final void A0E(Editable editable, int i) {
        int i2 = i + 1;
        if (((AnonymousClass6ED[]) editable.getSpans(i, i2, AnonymousClass6ED.class)).length < 1) {
            A0G(this.A0E);
            AnonymousClass6ED r1 = new AnonymousClass6ED(this.A00, false);
            this.A0E = r1;
            editable.setSpan(r1, i, i2, 33);
        }
    }

    public final void A0G(ForegroundColorSpan foregroundColorSpan) {
        if (foregroundColorSpan != null) {
            getText().removeSpan(foregroundColorSpan);
        }
    }

    public void A0H(ViewGroup viewGroup, C95814uZ r6, boolean z, boolean z2, boolean z3) {
        this.A0B = r6;
        addTextChangedListener(this.A0M);
        Context context = getContext();
        Context context2 = getContext();
        int i = R.attr.f3nameremoved;
        int i2 = R.color.f5nameremoved;
        if (z) {
            i = R.attr.f3nameremoved;
            i2 = R.color.f5nameremoved;
        }
        this.A01 = AnonymousClass5Yj.A03(context2, context, i, i2);
        Context context3 = getContext();
        Context context4 = getContext();
        int i3 = R.attr.f3nameremoved;
        int i4 = R.color.f5nameremoved;
        if (z) {
            i3 = R.attr.f3nameremoved;
            i4 = R.color.f5nameremoved;
        }
        this.A00 = AnonymousClass5Yj.A03(context4, context3, i3, i4);
        A0D(getText());
        this.A06 = viewGroup;
        Bundle A082 = AnonymousClass002.A08();
        this.A03 = A082;
        A082.putString("ARG_JID", C627336j.A07(r6));
        this.A03.putBoolean("ARG_IS_DARK_THEME", z);
        this.A03.putBoolean("ARG_HIDE_END_DIVIDER", z2);
        this.A03.putBoolean("ARG_WITH_BACKGROUND", z3);
    }

    public void A0I(AnonymousClass7HU r12, AnonymousClass3ZH r13) {
        C95814uZ r4;
        if (r13 != null && (r4 = r13.A0H) != null) {
            Editable text = getText();
            if (!this.A0K) {
                this.A02 = getInputType();
                this.A0K = true;
                setInputType(147457);
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                if (!(selectionStart == -1 || selectionEnd == -1)) {
                    setSelection(selectionStart, selectionEnd);
                }
            }
            AnonymousClass3ZM r10 = new AnonymousClass3ZM(r4, r12.A01);
            C106195Xz r0 = this.A0H;
            C626936e.A06(r0);
            String A032 = r0.A03(r10);
            int min = Math.min(A0A(text, 0), getSelectionStart());
            if (min < 0) {
                min = getSelectionStart();
            }
            int i = min + 1;
            String A0V = AnonymousClass000.A0V("@", A032, AnonymousClass001.A0o());
            A0G(this.A0E);
            this.A0E = null;
            int selectionEnd2 = getSelectionEnd();
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0x2.A1N(A0o, A0V);
            text.replace(min, selectionEnd2, A0o.toString());
            AnonymousClass6ED r42 = new AnonymousClass6ED(this.A00, true);
            text.setSpan(r42, min, i, 33);
            AnonymousClass6EE r1 = new AnonymousClass6EE(r42, C624435a.A00(r10), this.A01);
            text.setSpan(r1, i, C86664Kz.A0L(A032, i), 33);
            setSelection(0);
            setSelection(text.getSpanEnd(r1) + 1);
            A0J((String) null);
            if (this.A0K) {
                this.A0K = false;
                setInputType(this.A02);
                int selectionStart2 = getSelectionStart();
                int selectionEnd3 = getSelectionEnd();
                if (!(selectionStart2 == -1 || selectionEnd3 == -1)) {
                    setSelection(selectionStart2, selectionEnd3);
                }
            }
            C179518jH r02 = this.A0G;
            if (r02 != null) {
                C171498Hh r03 = (C171498Hh) r02;
                C87694Uy r2 = r03.A01;
                UserJid botMention = r03.A00.A05.getBotMention();
                if (!C162457s7.A0P(botMention, r2.A01)) {
                    r2.A01 = botMention;
                    AnonymousClass4FS r14 = r2.A06;
                    Runnable runnable = r2.A07;
                    r14.BjN(runnable);
                    r14.BkM(runnable);
                }
            }
        }
    }

    public final void A0J(String str) {
        if (this.A06 == null) {
            return;
        }
        if (str != null) {
            MentionPickerView mentionPickerView = this.A0D;
            if (mentionPickerView == null) {
                MentionPickerView mentionPickerView2 = (MentionPickerView) AnonymousClass001.A0R(C18280x3.A0D(this), this.A06, R.layout.f8nameremoved);
                this.A0D = mentionPickerView2;
                this.A06.addView(mentionPickerView2);
                this.A03.putBoolean("ARG_INCLUDE_BOT_CONTACTS", ((AnonymousClass5TH) this.A0J.get()).A01(this.A0B));
                this.A0D.setup(this, this.A03);
                View view = this.A05;
                if (view != null) {
                    this.A0D.setAnchorWidthView(view);
                }
                View view2 = this.A04;
                if (view2 != null) {
                    this.A0D.A03 = view2;
                }
                mentionPickerView = this.A0D;
                mentionPickerView.A0J = this;
            }
            if (mentionPickerView.A0P) {
                mentionPickerView.A0L.getFilter().filter(str);
            } else {
                mentionPickerView.A0N.BkL(new C991954u(mentionPickerView.A0E, mentionPickerView, mentionPickerView.A0M, str), mentionPickerView.A0I);
            }
            mentionPickerView.A0O = true;
            return;
        }
        MentionPickerView mentionPickerView3 = this.A0D;
        if (mentionPickerView3 != null) {
            mentionPickerView3.A0L.getFilter().filter((CharSequence) null);
            mentionPickerView3.A0O = false;
            mentionPickerView3.A00 = 0;
        }
    }

    public void BOd(boolean z) {
        int A0A2;
        this.A0L = z;
        C182728ot r0 = this.A0C;
        if (r0 != null) {
            r0.BOd(z);
        }
        if (!z || (A0A2 = A0A(getEditableText(), 0)) < 0) {
            A0G(this.A0E);
            this.A0E = null;
            return;
        }
        A0E(getEditableText(), A0A2);
    }

    public void BWP(AnonymousClass7HU r12, AnonymousClass3ZH r13, int i) {
        AnonymousClass7HU r8 = r12;
        AnonymousClass3ZH r7 = r13;
        int i2 = i;
        if (i == 8 || i == 32) {
            C116985rC r1 = this.A07;
            if (r1.A07() && ((AnonymousClass5TH) r1.A04()).A00()) {
                C89654ea A4J = C89654ea.A4J(getContext());
                if (A4J != null) {
                    C71433c6 r5 = new C71433c6(this, r7, r8, i2, 28);
                    ((AnonymousClass5TH) this.A07.A04()).A02.A00(A4J, new AnonymousClass8F0(r5), C996357k.INVOKE, C18290x4.A0b());
                    return;
                }
                return;
            }
        }
        A0I(r12, r13);
    }

    public UserJid getBotMention() {
        AnonymousClass5TH r2 = (AnonymousClass5TH) this.A07.A05();
        if (r2 == null || !r2.A00() || !r2.A03.A02()) {
            return null;
        }
        return r2.A01.A00(getMentions());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NI r6 = (AnonymousClass4NI) parcelable;
        super.onRestoreInstanceState(r6.getSuperState());
        String str = r6.A00;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                C626936e.A06(str2);
                setMentionableText(str2, C624435a.A03(str));
                setSelection(selectionStart, selectionEnd);
            }
        }
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0L) {
            A0J((String) null);
        }
        A0G(this.A0E);
        this.A0E = null;
        SpannableStringBuilder A002 = C18330xA.A00(str);
        A0F(A002, collection, true);
        setText(A002);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static final int A02(Editable editable, int i) {
        LinkedList A18 = AnonymousClass0x9.A18();
        Collections.addAll(A18, editable.getSpans(i, i, AnonymousClass6EE.class));
        Collections.addAll(A18, editable.getSpans(i, i, AnonymousClass6EC.class));
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int spanStart = editable.getSpanStart(next);
            if (next instanceof AnonymousClass6EE) {
                spanStart--;
            }
            int spanEnd = editable.getSpanEnd(next);
            int i2 = i;
            i = spanEnd;
            if (i2 <= (spanStart + spanEnd) / 2) {
                i = spanStart;
            }
        }
        return i;
    }

    public final int A0A(Editable editable, int i) {
        int lastIndexOf = editable.toString().substring(i, getSelectionEnd()).lastIndexOf("@");
        for (AnonymousClass6ED r0 : (AnonymousClass6ED[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, AnonymousClass6ED.class)) {
            if (r0.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    public final String A0B(int i, int i2) {
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i, i2));
        for (AnonymousClass6EE r3 : (AnonymousClass6EE[]) newEditable.getSpans(0, newEditable.length(), AnonymousClass6EE.class)) {
            newEditable.replace(newEditable.getSpanStart(r3) - 1, newEditable.getSpanEnd(r3), r3.A01);
        }
        return newEditable.toString();
    }

    public final void A0F(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZM r2 = (AnonymousClass3ZM) it.next();
            if (r2 != null) {
                C106195Xz r0 = this.A0H;
                C626936e.A06(r0);
                String A032 = r0.A03(r2);
                String A002 = C624435a.A00(r2);
                int indexOf = TextUtils.indexOf(spannableStringBuilder, A002);
                if (indexOf < 0) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("unable to set mention for ");
                    A0o.append(r2);
                    C18260x0.A1S(A0o, " in ", spannableStringBuilder);
                } else {
                    do {
                        spannableStringBuilder.replace(indexOf, C86664Kz.A0L(A002, indexOf), AnonymousClass000.A0V("@", A032, AnonymousClass001.A0o()));
                        if (z) {
                            AnonymousClass6ED r4 = new AnonymousClass6ED(this.A00, true);
                            int i = indexOf + 1;
                            spannableStringBuilder.setSpan(r4, indexOf, i, 33);
                            spannableStringBuilder.setSpan(new AnonymousClass6EE(r4, A002, this.A01), i, C86664Kz.A0L(A032, i), 33);
                        }
                        indexOf = TextUtils.indexOf(spannableStringBuilder, A002, indexOf + 1);
                    } while (indexOf >= 0);
                }
            }
        }
    }

    public boolean A0K(C95814uZ r3) {
        if (C627336j.A0K(r3) && (!this.A09.A0O(r3) || this.A03.A0X(3097))) {
            return true;
        }
        C116985rC r1 = this.A07;
        if (!r1.A07() || !((AnonymousClass5TH) r1.A04()).A02(r3)) {
            return false;
        }
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0N.A01();
    }

    public List getMentions() {
        C95814uZ r2;
        HashSet A0K2 = AnonymousClass002.A0K();
        for (AnonymousClass6EE r0 : (AnonymousClass6EE[]) getText().getSpans(0, C86624Kv.A03(this), AnonymousClass6EE.class)) {
            String substring = r0.A01.substring(1);
            String str = null;
            try {
                r2 = AnonymousClass32X.A00(substring);
            } catch (AnonymousClass24P unused) {
                r2 = GroupJid.Companion.A03(substring);
                if (r2 != null) {
                    str = this.A0H.A03(new AnonymousClass3ZM(r2, (String) null));
                }
            }
            if (r2 != null) {
                A0K2.add(new AnonymousClass3ZM(r2, str));
            }
        }
        return AnonymousClass002.A0J(A0K2);
    }

    public String getStringText() {
        return A0B(0, C86624Kv.A03(this));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            String[] strArr = A0O;
            if (strArr.length > 0) {
                EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
                Log.d("mentionable/entry/onCreateInputConnection: returning wrapper");
                return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C110465gH(this));
            }
        }
        return onCreateInputConnection;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C626936e.A06(onSaveInstanceState);
        return new AnonymousClass4NI(onSaveInstanceState, getStringText(), AnonymousClass4SQ.A00(this));
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable editableText = getEditableText();
        if (!TextUtils.isEmpty(editableText)) {
            setSelection(A02(editableText, i), A02(editableText, i2));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        int i2;
        CharSequence charSequence;
        AnonymousClass7IU r0;
        int A032 = C86624Kv.A03(this);
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = AnonymousClass001.A0D(selectionStart, selectionEnd, 0);
            A032 = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        C27991fJ A012 = AnonymousClass34R.A01(this.A0B);
        if (i == 16908322) {
            if (A012 != null) {
                C620633i r02 = this.A02;
                C626936e.A06(r02);
                ClipboardManager A0C2 = r02.A0C();
                if (A0C2 == null) {
                    Log.w("mentionableentry/on-text-context-menu-item cm=null");
                } else {
                    ClipData primaryClip = A0C2.getPrimaryClip();
                    if (!(primaryClip == null || primaryClip.getItemCount() == 0)) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        if (itemAt != null) {
                            charSequence = itemAt.getText();
                        } else {
                            charSequence = "";
                        }
                        SharedPreferences A033 = this.A0I.A03(C58152un.A0A);
                        String string = A033.getString("copied_message", "");
                        String string2 = A033.getString("copied_message_jids", "");
                        String string3 = A033.getString("copied_message_without_mentions", "");
                        if (!TextUtils.isEmpty(charSequence) && TextUtils.equals(charSequence, string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            List<AnonymousClass3ZM> A034 = C624435a.A03(string2);
                            C56892sj r03 = this.A0A;
                            C626936e.A06(r03);
                            C129526aS A042 = C56892sj.A01(r03, A012).A04();
                            HashSet A0K2 = AnonymousClass002.A0K();
                            C172878Nf it = A042.iterator();
                            while (it.hasNext()) {
                                A0K2.add(((C60842zG) it.next()).A03);
                            }
                            for (AnonymousClass3ZM r04 : this.A0H.A04(A012)) {
                                A0K2.add(r04.A00);
                            }
                            if (A034 == null) {
                                r0 = new AnonymousClass7IU(Collections.emptyList(), Collections.emptyList());
                            } else {
                                HashSet A0K3 = AnonymousClass002.A0K();
                                HashSet A0K4 = AnonymousClass002.A0K();
                                for (AnonymousClass3ZM r1 : A034) {
                                    if (A0K2.contains(r1.A00)) {
                                        A0K3.add(r1);
                                    } else {
                                        A0K4.add(r1);
                                    }
                                }
                                r0 = new AnonymousClass7IU(A0K3, A0K4);
                            }
                            C626936e.A06(string3);
                            Collection collection = (Collection) r0.A00;
                            Collection collection2 = (Collection) r0.A01;
                            if (this.A0L) {
                                A0J((String) null);
                            }
                            A0G(this.A0E);
                            this.A0E = null;
                            SpannableStringBuilder A002 = C18330xA.A00(string3);
                            A0F(A002, collection, true);
                            if (collection2 != null) {
                                A0F(A002, collection2, false);
                            }
                            getText().replace(i2, A032, A002);
                            return true;
                        }
                    }
                }
            }
        } else if (i == 16908320 || i == 16908321) {
            C18270x1.A0j(C60152y5.A00(this.A0I, C58152un.A0A).putString("copied_message_without_mentions", A0B(i2, A032)).putString("copied_message", getText().subSequence(i2, A032).toString()), "copied_message_jids", AnonymousClass4SQ.A00(this));
        }
        return super.onTextContextMenuItem(i);
    }

    public void setMentionPickerVisibilityChangeListener(C182728ot r1) {
        this.A0C = r1;
    }

    public void setOnCommitContentListener(C182738ou r1) {
        this.A0F = r1;
    }

    public void setOnMentionInsertedListener(C179518jH r1) {
        this.A0G = r1;
    }

    public void setText(String str) {
        for (AnonymousClass6EE r1 : (AnonymousClass6EE[]) getText().getSpans(0, C86624Kv.A03(this), AnonymousClass6EE.class)) {
            A0G(r1.A00);
            A0G(r1);
        }
        A0G(this.A0E);
        this.A0E = null;
        super.setText(str);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MentionableEntry(Context context) {
        super(context);
    }
}
