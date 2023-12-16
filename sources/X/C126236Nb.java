package X;

import com.facebook.stash.core.FileStash;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Nb  reason: invalid class name and case insensitive filesystem */
public class C126236Nb extends C1683084x {
    public final List A00 = AnonymousClass0x9.A18();
    public final List A01 = AnonymousClass0x9.A18();
    public final List A02 = AnonymousClass0x9.A18();

    public C126236Nb(FileStash fileStash, List list) {
        super(fileStash);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0g("attach");
        }
    }
}
