package org.jruby.runtime;

import org.jruby.RubyLocalJumpError;
import org.jruby.RubyModule;
import org.jruby.parser.StaticScope;
import org.jruby.runtime.Block.Type;
import org.jruby.runtime.builtin.IRubyObject;

public class NullBlockBody extends BlockBody {
    public NullBlockBody() {
        super(ZERO_ARGS);
    }

    @Override
    public IRubyObject call(ThreadContext context, IRubyObject[] args, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().newArrayNoCopy(args), "yield called out of block");
    }

    @Override
    public IRubyObject call(ThreadContext context, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().newArrayNoCopy(IRubyObject.NULL_ARRAY), "yield called out of block");
    }
    @Override
    public IRubyObject yieldSpecific(ThreadContext context, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().getNil(), "yield called out of block");
    }
    @Override
    public IRubyObject call(ThreadContext context, IRubyObject arg0, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().newArrayNoCopy(new IRubyObject[] {arg0}), "yield called out of block");
    }
    @Override
    public IRubyObject yieldSpecific(ThreadContext context, IRubyObject arg0, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().getNil(), "yield called out of block");
    }
    @Override
    public IRubyObject call(ThreadContext context, IRubyObject arg0, IRubyObject arg1, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().newArrayNoCopy(new IRubyObject[] {arg0, arg1}), "yield called out of block");
    }
    @Override
    public IRubyObject yieldSpecific(ThreadContext context, IRubyObject arg0, IRubyObject arg1, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().getNil(), "yield called out of block");
    }
    @Override
    public IRubyObject call(ThreadContext context, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().newArrayNoCopy(new IRubyObject[] {arg0, arg1, arg2}), "yield called out of block");
    }
    @Override
    public IRubyObject yieldSpecific(ThreadContext context, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, context.getRuntime().getNil(), "yield called out of block");
    }

    @Override
    public IRubyObject yield(ThreadContext context, IRubyObject value, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, value, "yield called out of block");
    }

    @Override
    public IRubyObject yield(ThreadContext context, IRubyObject value, IRubyObject self, RubyModule klass, boolean aValue, Binding binding, Type type) {
        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.NOREASON, value, "yield called out of block");
    }

    @Override
    public StaticScope getStaticScope() {
        return null;
    }

    public void setStaticScope(StaticScope newScope) {
    }

    @Override
    public Block cloneBlock(Binding binding) {
        return null;
    }

    @Override
    public Arity arity() {
        return null;
    }

    public String getFile() {
        return "(null)";
    }

    public int getLine() {
        return -1;
    }
}
