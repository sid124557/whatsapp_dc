package X;

import android.text.Editable;
import android.widget.EditText;
import java.text.NumberFormat;

/* renamed from: X.52O  reason: invalid class name */
public final class AnonymousClass52O extends C166677z5 {
    public int A00;
    public final EditText A01;
    public final C620733j A02;

    public void afterTextChanged(Editable editable) {
        String str;
        String str2;
        int intValue;
        C162457s7.A0J(editable, 0);
        EditText editText = this.A01;
        if (editText.getLayout() != null) {
            if (this.A00 + 1 == editText.getLineCount()) {
                editText.removeTextChangedListener(this);
                int selectionStart = editText.getSelectionStart();
                int lineForOffset = editText.getLayout().getLineForOffset(selectionStart);
                if (lineForOffset > 0) {
                    int i = lineForOffset - 1;
                    int lineStart = editText.getLayout().getLineStart(i);
                    int lineEnd = editText.getLayout().getLineEnd(i);
                    String obj = editable.subSequence(lineStart, lineEnd).toString();
                    int length = obj.length();
                    AnonymousClass58C r2 = null;
                    if (!AnonymousClass000.A1T(length)) {
                        C162457s7.A0J("* ", 1);
                        if (obj.startsWith("* ")) {
                            r2 = AnonymousClass58C.BULLET_LIST_STAR_PATTERN;
                        } else {
                            C162457s7.A0J("- ", 1);
                            if (obj.startsWith("- ")) {
                                r2 = AnonymousClass58C.BULLET_LIST_DASH_PATTERN;
                            } else if (C107635bd.A00(obj, Character.valueOf(obj.charAt(0)), 0) > 0) {
                                r2 = AnonymousClass58C.NUMBERED_LIST;
                            }
                        }
                    }
                    AnonymousClass58C r1 = AnonymousClass58C.BULLET_LIST_DASH_PATTERN;
                    if (r2 == r1 || r2 == AnonymousClass58C.BULLET_LIST_STAR_PATTERN) {
                        if (!obj.equals("* \n") && !obj.equals("- \n")) {
                            if (r2 == AnonymousClass58C.BULLET_LIST_STAR_PATTERN) {
                                str = "* ";
                            } else if (r2 == r1) {
                                str = "- ";
                            }
                        }
                        editable.delete(lineStart, lineEnd);
                    } else if (r2 == AnonymousClass58C.NUMBERED_LIST) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                str2 = obj;
                                break;
                            } else if (!Character.isDigit(obj.charAt(i2))) {
                                str2 = obj.substring(0, i2);
                                C162457s7.A0D(str2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        Integer A06 = C829745q.A06(str2);
                        NumberFormat A0M = this.A02.A0M();
                        C162457s7.A0D(A0M);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append(A0M.format(A06));
                        if (!C162457s7.A0P(AnonymousClass001.A0j(AnonymousClass000.A0l(AnonymousClass000.A0X(". ", A0o)), 10), obj)) {
                            if (A06 != null && (intValue = A06.intValue()) < 99) {
                                str = AnonymousClass000.A0T(A0M.format(Integer.valueOf(intValue + 1)), ". ");
                            }
                        }
                        editable.delete(lineStart, lineEnd);
                    }
                    editable.insert(selectionStart, str);
                }
                editText.addTextChangedListener(this);
            }
            this.A00 = editText.getLineCount();
        }
    }

    public AnonymousClass52O(EditText editText, C620733j r2) {
        C18260x0.A0Q(r2, editText);
        this.A02 = r2;
        this.A01 = editText;
    }
}
