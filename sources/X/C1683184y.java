package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.84y  reason: invalid class name and case insensitive filesystem */
public class C1683184y implements FileStash {
    public final C177748gO A00;
    public final C180598lK A01;
    public final File A02;

    public C1683184y(C180598lK r2, File file) {
        AnonymousClass82P r0 = AnonymousClass82P.A00;
        this.A02 = file;
        this.A01 = r2;
        this.A00 = r0;
    }

    public Set B4Q() {
        int length;
        String[] list = this.A02.list();
        if (list == null || (length = list.length) == 0) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String str : list) {
            char[] charArray = str.toCharArray();
            StringBuilder A0o = AnonymousClass001.A0o();
            int i = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                if (c == '%') {
                    try {
                        A0o.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    A0o.append(c);
                }
                i++;
            }
            str = A0o.toString();
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public long BD6() {
        return C159247lV.A00(this.A02);
    }

    public boolean Bj4(String str) {
        return this.A01.B1O(getFilePath(str));
    }

    public boolean Bj6() {
        C180598lK r0 = this.A01;
        File file = this.A02;
        if (!r0.B1O(file)) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public File getFilePath(String str) {
        File file = this.A02;
        char[] charArray = str.toCharArray();
        StringBuilder A0o = AnonymousClass001.A0o();
        for (char c : charArray) {
            if (c == '%' || C154737df.A00.contains(Character.valueOf(c))) {
                A0o.append('%');
                AnonymousClass001.A1N(A0o, c);
            } else {
                A0o.append(c);
            }
        }
        return AnonymousClass002.A0A(file, A0o.toString());
    }

    public File insertFile(String str) {
        this.A02.mkdirs();
        File filePath = getFilePath(str);
        filePath.setLastModified(System.currentTimeMillis());
        return filePath;
    }

    public long B8j(String str) {
        return C159247lV.A00(getFilePath(str));
    }

    public boolean BFI(String str) {
        return getFilePath(str).exists();
    }

    public long BJW(String str) {
        return getFilePath(str).lastModified();
    }

    public boolean Bj5(String str, int i) {
        return Bj4(str);
    }

    public File getFile(String str) {
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        filePath.setLastModified(System.currentTimeMillis());
        return filePath;
    }
}
