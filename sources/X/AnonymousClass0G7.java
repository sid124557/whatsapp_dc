package X;

import java.util.Map;

/* renamed from: X.0G7  reason: invalid class name */
public enum AnonymousClass0G7 {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass001.A0t();
        for (AnonymousClass0G7 r3 : values()) {
            if (r3 != UNSUPPORTED) {
                A00.put(r3.name().replace('_', '-'), r3);
            }
        }
    }
}
