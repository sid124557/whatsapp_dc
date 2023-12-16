package X;

import com.google.common.collect.ForwardingQueue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: X.6aI  reason: invalid class name and case insensitive filesystem */
public final class C129426aI<E> extends ForwardingQueue<E> implements Serializable, Serializable {
    public static final long serialVersionUID = 0;
    public final Queue delegate;
    public final int maxSize;

    public C129426aI(int i) {
        this();
        this.delegate = new ArrayDeque(10);
        this.maxSize = 10;
    }

    public static C129426aI create(int i) {
        return new C129426aI(10);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6aJ, X.6aI] */
    public boolean add(Object obj) {
        obj.getClass();
        if (this.maxSize != 0) {
            if (size() == this.maxSize) {
                this.delegate.remove();
            }
            this.delegate.add(obj);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6aJ, X.6aI, java.util.Collection] */
    public boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return C162247rW.addAll(this, C162247rW.skip(collection, size - this.maxSize));
    }

    public Object element() {
        return delegate().element();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6aJ, X.6aI] */
    public boolean offer(Object obj) {
        return add(obj);
    }

    public Object peek() {
        return delegate().peek();
    }

    public Object poll() {
        return delegate().poll();
    }

    public Object remove() {
        return delegate().remove();
    }

    public C129426aI() {
    }

    public Queue delegate() {
        return this.delegate;
    }
}
